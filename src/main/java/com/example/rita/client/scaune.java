package com.example.rita.client;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class scaune extends AppCompatActivity {
    public String s;
    public boolean[] ok =  new boolean[1000];
   // Arrays.fill(ok, boolean.FALSE);


    void SendServer(String s)
    {
        //  ClientThread ct = new ClientThread(s);
        //  ct.start();
        new Thread(new ClientThread(s)).start();

    }
    void SendData(int i)
    {
        SendServer(String.valueOf(i));

    }







    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scaune);



     final Button scaun1 = findViewById(R.id.button10);
        scaun1.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
              ok[0]=!ok[0];
           if(ok[0])
           {
               scaun1.setBackgroundColor(Color.YELLOW);
               SendData(1);
           }
           else scaun1.setBackgroundColor(Color.GREEN);


        }
    });

    final Button scaun2 = findViewById(R.id.button11);
        scaun2.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {


            ok[1]=!ok[1];
            if(ok[1])
            {
                scaun2.setBackgroundColor(Color.YELLOW);
                SendData(2);
            }
            else scaun2.setBackgroundColor(Color.GREEN);

        }
    });


   final Button scaun3 = (Button) findViewById(R.id.button12);
        scaun3.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {


            ok[2]=!ok[2];
            if(ok[2])
            {
                scaun3.setBackgroundColor(Color.YELLOW);
                SendData(3);
            }
            else scaun3.setBackgroundColor(Color.GREEN);
        }
    });

   final Button scaun4 = (Button) findViewById(R.id.button13);
        scaun4.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            ok[3]=!ok[3];
            if(ok[3])
            {
                scaun4.setBackgroundColor(Color.YELLOW);
                SendData(4);
            }
            else scaun4.setBackgroundColor(Color.GREEN);
        }
    });

 final   Button scaun5 = (Button) findViewById(R.id.button14);
        scaun5.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            ok[4]=!ok[4];
            if(ok[4])
            {
                scaun5.setBackgroundColor(Color.YELLOW);
                SendData(5);
            }
            else scaun5.setBackgroundColor(Color.GREEN);
        }
    });

   final Button scaun6 = (Button) findViewById(R.id.button15);
        scaun6.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            ok[5]=!ok[5];
            if(ok[5])
            {
                scaun6.setBackgroundColor(Color.YELLOW);
                SendData(6);
            }
            else scaun6.setBackgroundColor(Color.GREEN);

        }
    });

   final Button scaun7 = (Button) findViewById(R.id.button16);
        scaun7.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            ok[6]=!ok[6];
            if(ok[6])
            {
                scaun7.setBackgroundColor(Color.YELLOW);
                SendData(7);
            }
            else scaun7.setBackgroundColor(Color.GREEN);
        }
    });

    final Button scaun8 = (Button) findViewById(R.id.button17);
        scaun8.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            ok[7]=!ok[7];
           if(ok[7]) {
               scaun8.setBackgroundColor(Color.YELLOW);
               SendData(8);
           }
           else scaun8.setBackgroundColor(Color.GREEN);

        }
    });

   final Button scaun9 = (Button) findViewById(R.id.button18);
        scaun9.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {

        ok[8]=!ok[8];
           if(ok[0])
            {
                    scaun9.setBackgroundColor(Color.YELLOW);
                SendData(9);
            }
           else scaun1.setBackgroundColor(Color.GREEN);
        }
    });
    Button scaun10 = (Button) findViewById(R.id.button19);
        scaun10.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            ok[9]=!ok[9];
           if(ok[9])
           {
               scaun1.setBackgroundColor(Color.YELLOW);
               SendData(10);
           }
           else scaun1.setBackgroundColor(Color.GREEN);

        }
    });

    Button scaun11 = (Button) findViewById(R.id.button20);
        scaun1.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            SendData(11);
            ok[0]=!ok[0];
           if(ok[0]) scaun1.setBackgroundColor(Color.YELLOW);
           else scaun1.setBackgroundColor(Color.GREEN);

        }
    });

    Button scaun12 = (Button) findViewById(R.id.button21);
        scaun1.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            SendData(12);
            ok[0]=!ok[0];
           if(ok[0]) scaun1.setBackgroundColor(Color.YELLOW);
           else scaun1.setBackgroundColor(Color.GREEN);

        }
    });

    Button scaun13 = (Button) findViewById(R.id.button22);
        scaun1.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            SendData(13);
            ok[0]=!ok[0];
           if(ok[0]) scaun1.setBackgroundColor(Color.YELLOW);
           else scaun1.setBackgroundColor(Color.GREEN);

        }
    });

    Button scaun14 = (Button) findViewById(R.id.button23);
        scaun1.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            SendData(14);
            ok[0]=!ok[0];
           if(ok[0]) scaun1.setBackgroundColor(Color.YELLOW);
           else scaun1.setBackgroundColor(Color.GREEN);

        }
    });

    Button scaun15 = (Button) findViewById(R.id.button24);
        scaun1.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            SendData(15);

            ok[0]=!ok[0];
           if(ok[0]) scaun1.setBackgroundColor(Color.YELLOW);
           else scaun1.setBackgroundColor(Color.GREEN);

        }
    });

    Button scaun16 = (Button) findViewById(R.id.button25);
        scaun1.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            SendData(16);

            ok[0]=!ok[0];
           if(ok[0]) scaun1.setBackgroundColor(Color.YELLOW);
           else scaun1.setBackgroundColor(Color.GREEN);

        }
    });

    Button scaun17 = (Button) findViewById(R.id.button26);
        scaun1.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            SendData(17);

            ok[0]=!ok[0];
           if(ok[0]) scaun1.setBackgroundColor(Color.YELLOW);
           else scaun1.setBackgroundColor(Color.GREEN);

        }
    });

    Button scaun18 = (Button) findViewById(R.id.button27);
        scaun1.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            SendData(18);

            ok[0]=!ok[0];
           if(ok[0]) scaun1.setBackgroundColor(Color.YELLOW);
           else scaun1.setBackgroundColor(Color.GREEN);

        }
    });
    Button scaun19 = (Button) findViewById(R.id.button29);
        scaun1.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            SendData(19);

            ok[0]=!ok[0];
           if(ok[0]) scaun1.setBackgroundColor(Color.YELLOW);
           else scaun1.setBackgroundColor(Color.GREEN);

        }
    });

    Button scaun20 = (Button) findViewById(R.id.button29);
        scaun1.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            SendData(20);

            ok[0]=!ok[0];
           if(ok[0]) scaun1.setBackgroundColor(Color.YELLOW);
           else scaun1.setBackgroundColor(Color.GREEN);

        }
    });

    Button scaun21 = (Button) findViewById(R.id.button30);
        scaun1.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            SendData(21);

            ok[0]=!ok[0];
           if(ok[0]) scaun1.setBackgroundColor(Color.YELLOW);
           else scaun1.setBackgroundColor(Color.GREEN);

        }
    });

    Button scaun22 = (Button) findViewById(R.id.button31);
        scaun1.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            SendData(22);

            ok[0]=!ok[0];
           if(ok[0]) scaun1.setBackgroundColor(Color.YELLOW);
           else scaun1.setBackgroundColor(Color.GREEN);

        }
    });

    Button scaun23 = (Button) findViewById(R.id.button32);
        scaun1.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            SendData(23);

            ok[0]=!ok[0];
           if(ok[0]) scaun1.setBackgroundColor(Color.YELLOW);
           else scaun1.setBackgroundColor(Color.GREEN);

        }
    });

    Button scaun24 = (Button) findViewById(R.id.button33);
        scaun1.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            SendData(24);

            ok[0]=!ok[0];
           if(ok[0]) scaun1.setBackgroundColor(Color.YELLOW);
           else scaun1.setBackgroundColor(Color.GREEN);

        }
    });

    Button scaun25 = (Button) findViewById(R.id.button34);
        scaun1.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            SendData(25);

            ok[0]=!ok[0];
           if(ok[0]) scaun1.setBackgroundColor(Color.YELLOW);
           else scaun1.setBackgroundColor(Color.GREEN);

        }
    });

    Button scaun26 = (Button) findViewById(R.id.button35);
        scaun1.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            SendData(26);

            ok[0]=!ok[0];
           if(ok[0]) scaun1.setBackgroundColor(Color.YELLOW);
           else scaun1.setBackgroundColor(Color.GREEN);

        }
    });

    Button scaun27 = (Button) findViewById(R.id.button36);
        scaun1.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            SendData(27);

            ok[0]=!ok[0];
           if(ok[0]) scaun1.setBackgroundColor(Color.YELLOW);
           else scaun1.setBackgroundColor(Color.GREEN);

        }
    });
    Button scaun28 = (Button) findViewById(R.id.button37);
        scaun1.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            SendData(28);

            ok[0]=!ok[0];
           if(ok[0]) scaun1.setBackgroundColor(Color.YELLOW);
           else scaun1.setBackgroundColor(Color.GREEN);

        }
    });

    Button scaun29 = (Button) findViewById(R.id.button38);
        scaun1.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            SendData(29);

            ok[0]=!ok[0];
           if(ok[0]) scaun1.setBackgroundColor(Color.YELLOW);
           else scaun1.setBackgroundColor(Color.GREEN);

        }
    });

    Button scaun30 = (Button) findViewById(R.id.button39);
        scaun1.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            SendData(30);

            ok[0]=!ok[0];
           if(ok[0]) scaun1.setBackgroundColor(Color.YELLOW);
           else scaun1.setBackgroundColor(Color.GREEN);

        }
    });

    Button scaun31 = (Button) findViewById(R.id.button40);
        scaun1.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            SendData(31);

            ok[0]=!ok[0];
           if(ok[0]) scaun1.setBackgroundColor(Color.YELLOW);
           else scaun1.setBackgroundColor(Color.GREEN);

        }
    });

    Button scaun32 = (Button) findViewById(R.id.button41);
        scaun1.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            SendData(32);

            ok[0]=!ok[0];
           if(ok[0]) scaun1.setBackgroundColor(Color.YELLOW);
           else scaun1.setBackgroundColor(Color.GREEN);

        }
    });

    Button scaun33 = (Button) findViewById(R.id.button42);
        scaun1.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            SendData(33);

            ok[0]=!ok[0];
           if(ok[0]) scaun1.setBackgroundColor(Color.YELLOW);
           else scaun1.setBackgroundColor(Color.GREEN);

        }
    });

    Button scaun34 = (Button) findViewById(R.id.button43);
        scaun1.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            SendData(34);

            ok[0]=!ok[0];
           if(ok[0]) scaun1.setBackgroundColor(Color.YELLOW);
           else scaun1.setBackgroundColor(Color.GREEN);

        }
    });

    Button scaun35 = (Button) findViewById(R.id.button44);
        scaun1.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            SendData(35);

            ok[0]=!ok[0];
           if(ok[0]) scaun1.setBackgroundColor(Color.YELLOW);
           else scaun1.setBackgroundColor(Color.GREEN);

        }
    });

    Button scaun36 = (Button) findViewById(R.id.button45);
        scaun1.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            SendData(36);

            ok[0]=!ok[0];
           if(ok[0]) scaun1.setBackgroundColor(Color.YELLOW);
           else scaun1.setBackgroundColor(Color.GREEN);

        }
    });
    Button scaun37 = (Button) findViewById(R.id.button46);
        scaun1.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            SendData(37);
            ok[0]=!ok[0];
           if(ok[0]) scaun1.setBackgroundColor(Color.YELLOW);
           else scaun1.setBackgroundColor(Color.GREEN);

        }
    });

    Button scaun38 = (Button) findViewById(R.id.button47);
        scaun1.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            SendData(38);

            ok[0]=!ok[0];
           if(ok[0]) scaun1.setBackgroundColor(Color.YELLOW);
           else scaun1.setBackgroundColor(Color.GREEN);

        }
    });

    Button scaun39 = (Button) findViewById(R.id.button48);
        scaun1.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            SendData(39);

            ok[0]=!ok[0];
           if(ok[0]) scaun1.setBackgroundColor(Color.YELLOW);
           else scaun1.setBackgroundColor(Color.GREEN);

        }
    });

    Button scaun40 = (Button) findViewById(R.id.button49);
        scaun1.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            SendData(40);

            ok[0]=!ok[0];
           if(ok[0]) scaun1.setBackgroundColor(Color.YELLOW);
           else scaun1.setBackgroundColor(Color.GREEN);

        }
    });

    Button scaun41 = (Button) findViewById(R.id.button50);
        scaun1.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            SendData(41);

            ok[0]=!ok[0];
           if(ok[0]) scaun1.setBackgroundColor(Color.YELLOW);
           else scaun1.setBackgroundColor(Color.GREEN);

        }
    });

    Button scaun42 = (Button) findViewById(R.id.button51);
        scaun1.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            SendData(42);

            ok[0]=!ok[0];
           if(ok[0]) scaun1.setBackgroundColor(Color.YELLOW);
           else scaun1.setBackgroundColor(Color.GREEN);

        }
    });

    Button scaun43 = (Button) findViewById(R.id.button52);
        scaun1.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            SendData(43);


            ok[0]=!ok[0];
           if(ok[0]) scaun1.setBackgroundColor(Color.YELLOW);
           else scaun1.setBackgroundColor(Color.GREEN);

        }
    });

    Button scaun44 = (Button) findViewById(R.id.button53);
        scaun1.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            SendData(44);

            ok[0]=!ok[0];
           if(ok[0]) scaun1.setBackgroundColor(Color.YELLOW);
           else scaun1.setBackgroundColor(Color.GREEN);

        }
    });

    Button scaun45 = (Button) findViewById(R.id.button54);
        scaun1.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            SendData(45);

            ok[0]=!ok[0];
           if(ok[0]) scaun1.setBackgroundColor(Color.YELLOW);
           else scaun1.setBackgroundColor(Color.GREEN);

        }
    });
    Button scaun46 = (Button) findViewById(R.id.button55);
        scaun1.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            SendData(46);

            ok[0]=!ok[0];
           if(ok[0]) scaun1.setBackgroundColor(Color.YELLOW);
           else scaun1.setBackgroundColor(Color.GREEN);
        }
    });

    Button scaun47 = (Button) findViewById(R.id.button56);
        scaun1.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            SendData(47);

            ok[0]=!ok[0];
           if(ok[0]) scaun1.setBackgroundColor(Color.YELLOW);
           else scaun1.setBackgroundColor(Color.GREEN);

        }
    });

    Button scaun48 = (Button) findViewById(R.id.button57);
        scaun1.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            SendData(48);

            ok[0]=!ok[0];
           if(ok[0]) scaun1.setBackgroundColor(Color.YELLOW);
           else scaun1.setBackgroundColor(Color.GREEN);

        }
    });

    Button scaun49 = (Button) findViewById(R.id.button58);
        scaun1.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            SendData(49);

            ok[0]=!ok[0];
           if(ok[0]) scaun1.setBackgroundColor(Color.YELLOW);
           else scaun1.setBackgroundColor(Color.GREEN);

        }
    });

    Button scaun50 = (Button) findViewById(R.id.button59);
        scaun1.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            SendData(50);

            ok[0]=!ok[0];
           if(ok[0]) scaun1.setBackgroundColor(Color.YELLOW);
           else scaun1.setBackgroundColor(Color.GREEN);

        }
    });

    Button scaun51 = (Button) findViewById(R.id.button60);
        scaun1.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            SendData(51);

            ok[0]=!ok[0];
           if(ok[0]) scaun1.setBackgroundColor(Color.YELLOW);
           else scaun1.setBackgroundColor(Color.GREEN);

        }
    });

    Button scaun52= (Button) findViewById(R.id.button61);
        scaun1.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            SendData(52);

            ok[0]=!ok[0];
           if(ok[0]) scaun1.setBackgroundColor(Color.YELLOW);
           else scaun1.setBackgroundColor(Color.GREEN);

        }
    });

    Button scaun53 = (Button) findViewById(R.id.button62);
        scaun1.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            SendData(53);

            ok[0]=!ok[0];
           if(ok[0]) scaun1.setBackgroundColor(Color.YELLOW);
           else scaun1.setBackgroundColor(Color.GREEN);

        }
    });

    Button scaun54 = (Button) findViewById(R.id.button63);
        scaun1.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            SendData(54);

            ok[0]=!ok[0];
           if(ok[0]) scaun1.setBackgroundColor(Color.YELLOW);
           else scaun1.setBackgroundColor(Color.GREEN);

        }
    });
    Button scaun55 = (Button) findViewById(R.id.button64);
        scaun1.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            SendData(55);

            ok[0]=!ok[0];
           if(ok[0]) scaun1.setBackgroundColor(Color.YELLOW);
           else scaun1.setBackgroundColor(Color.GREEN);

        }
    });

    Button scaun56 = (Button) findViewById(R.id.button65);
        scaun1.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            SendData(56);

            ok[0]=!ok[0];
           if(ok[0]) scaun1.setBackgroundColor(Color.YELLOW);
           else scaun1.setBackgroundColor(Color.GREEN);

        }
    });

    Button scaun57 = (Button) findViewById(R.id.button66);
        scaun1.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            SendData(57);

            ok[0]=!ok[0];
           if(ok[0]) scaun1.setBackgroundColor(Color.YELLOW);
           else scaun1.setBackgroundColor(Color.GREEN);

        }
    });

    Button scaun58 = (Button) findViewById(R.id.button67);
        scaun1.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            SendData(58);

            ok[0]=!ok[0];
           if(ok[0]) scaun1.setBackgroundColor(Color.YELLOW);
           else scaun1.setBackgroundColor(Color.GREEN);

        }
    });

    Button scaun59 = (Button) findViewById(R.id.button68);
        scaun1.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            SendData(59);

            ok[0]=!ok[0];
           if(ok[0]) scaun1.setBackgroundColor(Color.YELLOW);
           else scaun1.setBackgroundColor(Color.GREEN);

        }
    });

    Button scaun60 = (Button) findViewById(R.id.button69);
        scaun1.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            SendData(60);

            ok[0]=!ok[0];
           if(ok[0]) scaun1.setBackgroundColor(Color.YELLOW);
           else scaun1.setBackgroundColor(Color.GREEN);

        }
    });

    Button scaun61 = (Button) findViewById(R.id.button70);
        scaun1.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            SendData(61);

            ok[0]=!ok[0];
           if(ok[0]) scaun1.setBackgroundColor(Color.YELLOW);
           else scaun1.setBackgroundColor(Color.GREEN);

        }
    });

    Button scaun62 = (Button) findViewById(R.id.button71);
        scaun1.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            SendData(62);

            ok[0]=!ok[0];
           if(ok[0]) scaun1.setBackgroundColor(Color.YELLOW);
           else scaun1.setBackgroundColor(Color.GREEN);

        }
    });

    Button scaun63 = (Button) findViewById(R.id.button72);
        scaun1.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            SendData(63);

            ok[0]=!ok[0];
           if(ok[0]) scaun1.setBackgroundColor(Color.YELLOW);
           else scaun1.setBackgroundColor(Color.GREEN);

        }
    });



*/

}
}
