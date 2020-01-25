using System;
using System.Collections.Generic;
using System.Data.SQLite;
using System.IO;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace FinalDatabase
{
    public class Class1
    {
        public class SQLiteHandler
        {
            private string data = "";
            private SQLiteConnection _conn;

            public SQLiteHandler()
            {

            }
            private string connectToDb()
            {
                if (!File.Exists("Server.sqlite"))
                {
                    SQLiteConnection.CreateFile("Server.sqlite");
                }
                try
                {
                    _conn = new SQLiteConnection("Data Source=Server.sqlite; Version = 3;");
                    _conn.Open();
                }
                catch (Exception e)
                {
                    return e.ToString();
                }
                string s1 = "CREATE TABLE IF NOT EXISTS Filme (ID INTEGER PRIMARY KEY, NumeFilm TEXT);";
                string s2 = "CREATE TABLE IF NOT EXISTS Ore(Ora TEXT,Filme_ID INTEGER);";
                string s3 = "CREATE TABLE IF NOT EXISTS Scaune(scaune TEXT, Filme_ID INTEGER);";
                //   string s4 = "Create table if not exist CINEMA(Filme_ID INTEGER NOT NULL,Scaune_ID INTEGER NOT NULL,Ora_ID INTEGER NOT NULL)";  // ora? are ID?

                SQLiteCommand cmd = new SQLiteCommand(s1, _conn);
                try
                {
                    cmd.ExecuteNonQuery();
                }
                catch (Exception ex)
                {
                    return ex.ToString();
                }
              
                cmd = new SQLiteCommand(s2, _conn);
                try
                {
                    cmd.ExecuteNonQuery();
                }
                catch (Exception ex)
                {
                    return ex.ToString();
                }
             
                cmd = new SQLiteCommand(s3, _conn);
                try
                {
                    cmd.ExecuteNonQuery();
                }
                catch (Exception ex)
                {
                    return ex.ToString();
                }
                return "Succes";
            }
            public List<string> GetAllMovies()
            {
                List<string> date = new List<string>();
                connectToDb();
                string stmt = "SELECT * FROM Filme";
                SQLiteCommand cmd = new SQLiteCommand(stmt, _conn);
                SQLiteDataReader reader = null;
                try { reader = cmd.ExecuteReader(); }
                catch (Exception e)
                {
                    return null;
                }
               
                while (reader.Read())
                {
                    date.Add( reader.GetString(1));
                }
                reader.Close();
                disconnectFromDb();
                return date;
            }
            public List<string> GetAllHours()
            {
                List<string> date = new List<string>();
                connectToDb();
                string stmt = "SELECT * FROM Ore";
                SQLiteCommand cmd = new SQLiteCommand(stmt, _conn);
                SQLiteDataReader reader = null;
                try { reader = cmd.ExecuteReader(); }
                catch (Exception e)
                {
                    return null;
                }

                while (reader.Read())
                {
                    date.Add(reader.GetString(0));
                }
                reader.Close();
                disconnectFromDb();
                return date;
            }
            public List<string> GetAllChairs()
            {
                List<string> date = new List<string>();
                connectToDb();
                string stmt = "SELECT * FROM Scaune";
                SQLiteCommand cmd = new SQLiteCommand(stmt, _conn);
                SQLiteDataReader reader = null;
                try { reader = cmd.ExecuteReader(); }
                catch (Exception e)
                {
                    return null;
                }

                while (reader.Read())
                {
                    date.Add(reader.GetString(0));
                }
                reader.Close();
                disconnectFromDb();
                return date;
            }
            private void disconnectFromDb()
            {
                if (null != _conn)
                {
                    _conn.Close();
                    _conn.Dispose();
                    _conn = null;

                }
            }
            public void DisconnectFromDb()
            {
                disconnectFromDb();
            }

            public string InsertFilme(string numeFilme)
            {
                connectToDb();
                string stmt = "INSERT INTO Filme(NumeFilm) VALUES(@param1);";
                SQLiteCommand cmd = new SQLiteCommand(stmt, _conn);
                cmd.Parameters.AddWithValue("@param1", numeFilme);
                try
                {
                    cmd.ExecuteNonQuery();
                }
                catch (Exception ex)
                {
                    return ex.ToString();
                }
                disconnectFromDb();
                return "Succes";
            }
            private string InsertOra(string ora, string numeFilm)
            {
                connectToDb();
                int Id = 0;           
                 Id = ExistsMovie(numeFilm);            
                 //string to integer
                if (Id != 0)
                {
                    string stmt = "INSERT INTO Ore(Ora,Filme_ID) VALUES(@param1, @param2);";
                    SQLiteCommand cmd = new SQLiteCommand(stmt, _conn);
                    cmd.Parameters.AddWithValue("@param1", ora);
                    cmd.Parameters.AddWithValue("@param2", Id);
                    try
                    {
                        cmd.ExecuteNonQuery();
                    }
                    catch (Exception ex)
                    {
                        return ex.ToString();
                    }
                    disconnectFromDb();
                    return "Succes";
                }
                else return null;

            }

            private string InsertScaune(string scaune, string numeFilm)
            {
                connectToDb();
                int Id = 0;
                Id = ExistsMovie(numeFilm); //string to integer
                if (Id != 0)
                {
                    string stmt = "INSERT INTO Scaune(scaune,Filme_ID) VALUES(@param1, @param2);";
                    SQLiteCommand cmd = new SQLiteCommand(stmt, _conn);
                    cmd.Parameters.AddWithValue("@param1", scaune);
                    cmd.Parameters.AddWithValue("@param2", Id);


                    try
                    {
                        cmd.ExecuteNonQuery();
                    }
                    catch (Exception ex)
                    {
                        return ex.ToString();
                    }
                    disconnectFromDb();
                    return "Succes";
                }
                else return null;
            }


            public string InsertFilmep(string numeFilme)
            {
                return InsertFilme(numeFilme);
            }

            private int ExistsMovie(string numeFilm)
            {
                string stmt = "SELECT ID FROM Filme WHERE(NumeFilm=@param1);";
                SQLiteCommand cmd = new SQLiteCommand(stmt, _conn);
                cmd.Parameters.AddWithValue("@param1", numeFilm);
                SQLiteDataReader reader = null;
                try { reader = cmd.ExecuteReader(); }
                catch (Exception e)
                {
                    return 0;
                }
                int data = 0;
                while (reader.Read())
                {
                    data = reader.GetInt32(0);

                }
                reader.Close();
                if (data != 0)
                    return data;
                return 0;
            }

            private string DropTable()
            {
                string stmt = "DROP TABLE IF EXISTS Filme;";
                SQLiteCommand cmd = new SQLiteCommand(stmt, _conn);
                try
                {
                    cmd.ExecuteNonQuery();
                }
                catch (Exception ex)
                {
                    return ex.ToString();
                }
                stmt = "DROP TABLE IF EXISTS Ore;";
                cmd = new SQLiteCommand(stmt, _conn);
                try
                {
                    cmd.ExecuteNonQuery();
                }
                catch (Exception ex)
                {
                    return ex.ToString();
                }

                stmt = "DROP TABLE IF EXISTS Scaune;";
                cmd = new SQLiteCommand(stmt, _conn);
                try
                {
                    cmd.ExecuteNonQuery();
                }
                catch (Exception ex)
                {
                    return ex.ToString();
                }

                return "Stergerea Tabelului a fost realizata cu succes";
            }
            public class CitireFisier
            {

                private SQLiteHandler BD = new SQLiteHandler();

                public void CitireDinFisier()
                {
                    string numeFilme = "";
                    string ora = "";
                    string scaune = "";

                    int i = 0;

                    string con = BD.connectToDb();
                    Console.WriteLine(con);
                    string ret = BD.DropTable();
                    Console.WriteLine(ret);                   
                    BD.DisconnectFromDb();
                    con = BD.connectToDb();
                    Console.WriteLine(con);

                    using (StreamReader sr = File.OpenText("numeFilme.txt"))
                    {
                        string s = String.Empty;
                        while ((s = sr.ReadLine()) != null)
                        {

                            i++;
                            if (i == 4)
                                i = 1;

                            if (i == 1)
                            {
                                numeFilme = s;
                                BD.InsertFilme(numeFilme);
                            }
                            else if (i == 2)
                            {
                                ora = s;
                                BD.InsertOra(ora, numeFilme);
                                Console.WriteLine(s);
                            }
                            else if (i == 3)
                            {
                                scaune = s;
                                BD.InsertScaune(scaune, numeFilme);
                            }

                        }
                    }


                    BD.disconnectFromDb();
                }


            }
        }
    }
}
