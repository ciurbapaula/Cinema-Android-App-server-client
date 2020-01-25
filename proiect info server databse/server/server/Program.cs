using System;
using System.Collections.Generic;
using System.Linq;
using System.Net;
using System.Net.Sockets;
using System.Text;
using System.Threading.Tasks;

namespace server
{
    class Program
    {
        static FinalDatabase.Class1.SQLiteHandler db = new FinalDatabase.Class1.SQLiteHandler();
        static FinalDatabase.Class1.SQLiteHandler.CitireFisier c = new FinalDatabase.Class1.SQLiteHandler.CitireFisier();
        private static byte[] buffer = new byte[1024];
        private static List<Socket> client = new List<Socket>();
        private static Socket _socket = new Socket(AddressFamily.InterNetwork, SocketType.Stream, ProtocolType.Tcp); //constructia socketului
        static string input;
        static void Main(string[] args)
        {
            Console.Title="Server";
            setup();
            input = Console.ReadLine();
            if(input == "citire")
            {
                adaugareDB();
            }
            else
            {
            
            }
            Console.ReadLine();
           
        }
        private static void setup()
        {
            Console.WriteLine("setting up server...");
            IPAddress ip;
            IPAddress.TryParse("192.168.0.102", out ip);
            Console.WriteLine(ip);
            _socket.Bind(new IPEndPoint(ip, 132));

            _socket.Listen(10);
            //incepem ascultarea conexiunilor
            _socket.BeginAccept(new AsyncCallback(AcceptCallback), null);
        }
        //definim connection Accept callback

        private static void AcceptCallback(IAsyncResult ar)
        {
            Socket socket = _socket.EndAccept(ar); //apoi adaugam socketul nostru la lista de clienti
            Console.WriteLine("client connected");
            client.Add(socket); // incepem acceptarea dinnou
            socket.BeginReceive(buffer, 0,buffer.Length, SocketFlags.None, new AsyncCallback(ReceiveCallback),socket); //mereu cand ne adaugam socketul la o conexiune deasemena trebuie sa incepem sa primim informatii de la client
            _socket.BeginAccept(new AsyncCallback(AcceptCallback), null); // acesta ne va permite sa acceptam mai mult de 1 conexiune
            
        }

        private static void ReceiveCallback(IAsyncResult ar)
        {
            Socket socket = (Socket)ar.AsyncState;
            //cate date am primit
            int received = socket.EndReceive(ar);
            //cream un buffer temporar
            byte[] databuff = new byte[received];
            Array.Copy(buffer, databuff, received);// ca sa copieze cantitatea potrivita de bytes in databufferul nostru

            string text = Encoding.ASCII.GetString(databuff);
            string source = text;
            text = string.Concat(source.Where(c => !char.IsWhiteSpace(c)));
            Console.WriteLine("Text received : " + text);          
            //cod
            //pt data
            string response = string.Empty;
           /* if(text.ToLower()!="get list")
            {
                response = "invalid request";
            }
            else
            {
                response = "movie 1... \n movie 2 ...  \n movie 3... \n\naici vom face legatura cu baza de date";
            }
            */
            if(text.ToLower()=="lista filme")
           {
                List<string> Filme = db.GetAllMovies();
                if (Filme != null)
                {
                    foreach (string item in Filme)
                    {
                        response += item.ToString() + " ";
                    }
                }
                else
                    response = "\nNu exista filme";
                
            }
            else if(text.ToLower()=="orar")
            {
                List<string> Ore = db.GetAllHours();
                if (Ore != null)
                {
                    foreach (string item in Ore)
                    {
                        response += item.ToString() + " ";
                    }
                }
                else
                    response = "\nNu exista ore";
            }
            else if (text.ToLower() == "scaune")
            {
                List<string>scaune = db.GetAllChairs();
                if (scaune != null)
                {
                    foreach (string item in scaune)
                    {
                        response += item.ToString() + " ";
                    }
                }
                else
                    response = "\nNu exista scaune";
            }
            else if(text.ToLower() == "get all")
            {

                List<string> Filme = db.GetAllMovies();
                List<string> Ore = db.GetAllHours();
                List<string> scaune = db.GetAllChairs();
                if (Filme != null)
                {
                    for (int i = 0; i < Filme.Count-1; i++)
                    {
                        response += Filme[i].ToString() + "\n " + Ore[i].ToString() + "\n" + scaune[i].ToString() + "\n";
                    }
                }
                else response = "no movies";
            }
            else
           {
                response = "invalid request";
                //  response = DateTime.Now.ToLongTimeString();
               
           }



           byte[] data = Encoding.ASCII.GetBytes(response);
           socket.BeginSend(data, 0, data.Length, SocketFlags.None, new AsyncCallback(SendCallback), socket);
           socket.BeginReceive(buffer, 0, buffer.Length, SocketFlags.None, new AsyncCallback(ReceiveCallback), socket);    
       }
       private static void SendCallback(IAsyncResult ar)
       {
           Socket socket = (Socket)ar.AsyncState;
           socket.EndSend(ar);
       }
        public static void adaugareDB()
        {
            c.CitireDinFisier();
        
        }

   }
}
