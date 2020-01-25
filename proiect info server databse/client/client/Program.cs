using System;
using System.Collections.Generic;
using System.Linq;
using System.Net;
using System.Net.Sockets;
using System.Text;
using System.Threading.Tasks;

namespace client
{
    class Program
    {
       
        private static Socket cl = new Socket(AddressFamily.InterNetwork, SocketType.Stream, ProtocolType.Tcp);
        static void Main(string[] args)
        {
            Console.Title = "Client";
            LoopConnect();
            SendLoop(); // pt trimiterea datelor
            Console.ReadLine();
        }

        private static void SendLoop()
        {
            while(true)
            {
                //Thread.Sleep(500); , stergem cele 2 randuri de dedesubt si va trimite direct timpul fara oprire
                Console.WriteLine("Enter a request: ");
                string req = Console.ReadLine();
                byte[] buffer = Encoding.ASCII.GetBytes(req);
                cl.Send(buffer);  // in aceeasi timp se va incepe si primirea informatiilor 
                byte[] receivedBuf = new byte[1024];
                int rec = cl.Receive(receivedBuf);//vom cauta un raspuns imediat
                byte[] data = new byte[rec];
                Array.Copy(receivedBuf, data, rec);
                Console.WriteLine("Received " + Encoding.ASCII.GetString(data));
            }
        }

        private static void LoopConnect()
        {
            //numaram cate conexiuni avem
            int nr = 0;
            while (!cl.Connected)
            {
                try
                {
                    nr++;
                    cl.Connect(IPAddress.Loopback,132); //loopback ca sa se conecteze de la sine
                }
                catch (SocketException)
                {
                    Console.Clear();
                    Console.WriteLine("Connection attempts: " + nr.ToString());
                }
            }
            Console.Clear(); // cand se conecteaza eliberam consola
            Console.WriteLine("Connected");
        }
    }
}
