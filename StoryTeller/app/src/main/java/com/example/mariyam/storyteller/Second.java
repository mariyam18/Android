package com.example.mariyam.storyteller;

import android.content.Context;
import android.media.Image;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.squareup.picasso.Picasso;

public class Second extends AppCompatActivity {

    Button btnStart,btnYes,btnNo,btnBack,btnTake,btnYes2,btnNo2;

    ImageView oneimg,twoimg,threeimg,fourimg,fiveimg,siximg,sevenimg,eightimg,nineimg,tenimg;
    ImageView elevenimg,twelveimg,thirteenimg,fourteenimg,fifteenimg,sixteenimg,seventeenimg,egg2img;
    ImageView eighteenimg,nineteenimg,twentyimg,twentyoneimg,twentytwoimg,twentythreeimg,twentyfourimg;
    ImageView twentyfiveimg,twentysiximg,twentysevenimg,twentyeightimg,twentynineimg,thirtyimg,thirtyoneimg;

    TextView one,two,three,four,five,six,seven,eight,nine,ten,eleven,twelve,thirteen,fourteen;
    TextView fifteen,sixteen,seventeen,eighteen,nineteen,twenty,twentyone,twentytwo,twentythree;
    TextView twentyfour,twentyfive,twentysix,twentyseven,twentyeight,twentynine,thirty,thirtyone;

    TextView txthunter,txtstorm1,txtback,txtstorm2,egg2,txtmoral;
Context context;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);


        btnStart = (Button) findViewById(R.id.btnStart);
        btnYes = (Button) findViewById(R.id.btnyes);
        btnNo = (Button) findViewById(R.id.btnNo);
        btnBack = (Button) findViewById(R.id.btnback);
        btnTake = (Button) findViewById(R.id.btntake);
        btnYes2 = (Button) findViewById(R.id.btnyes2);
        btnNo2 = (Button) findViewById(R.id.btnno2);


        oneimg = (ImageView) findViewById(R.id.oneimg);
        twoimg = (ImageView) findViewById(R.id.twoimg);
        threeimg = (ImageView) findViewById(R.id.threeimg);
        fourimg = (ImageView) findViewById(R.id.fourimg);
        fiveimg = (ImageView) findViewById(R.id.fiveimg);
        siximg = (ImageView) findViewById(R.id.siximg);
        sevenimg = (ImageView) findViewById(R.id.sevenimg);
        eightimg = (ImageView) findViewById(R.id.eightimg);
        nineimg = (ImageView) findViewById(R.id.nineimg);
        tenimg = (ImageView) findViewById(R.id.tenimg);
        elevenimg = (ImageView) findViewById(R.id.elevenimg);
        twelveimg = (ImageView) findViewById(R.id.twelveimg);
        egg2img = (ImageView) findViewById(R.id.egg2img);

        thirteenimg = (ImageView) findViewById(R.id.thirteenimg);
        fourteenimg = (ImageView) findViewById(R.id.fourteenimg);
        fifteenimg = (ImageView) findViewById(R.id.fifteenimg);
        sixteenimg = (ImageView) findViewById(R.id.sixteenimg);
        seventeenimg = (ImageView) findViewById(R.id.seventeenimg);
        eighteenimg = (ImageView) findViewById(R.id.eighteenimg);
        nineteenimg = (ImageView) findViewById(R.id.nineteenimg);
        twentyimg = (ImageView) findViewById(R.id.twentyimg);
        twentyoneimg = (ImageView) findViewById(R.id.twentyoneimg);
        twentytwoimg = (ImageView) findViewById(R.id.twentytwoimg);
        twentythreeimg = (ImageView) findViewById(R.id.twentythreeimg);
        twentyfourimg = (ImageView) findViewById(R.id.twentyfourimg);
        twentyfiveimg = (ImageView) findViewById(R.id.twentyfiveimg);
        twentysiximg = (ImageView) findViewById(R.id.twentysiximg);
        twentysevenimg = (ImageView) findViewById(R.id.twentysevenimg);
        twentyeightimg = (ImageView) findViewById(R.id.twentyeightimg);
        twentynineimg = (ImageView) findViewById(R.id.twentynineimg);
        thirtyimg = (ImageView) findViewById(R.id.thirtyimg);
        thirtyoneimg = (ImageView) findViewById(R.id.thirtyoneimg);


        one = (TextView) findViewById(R.id.one);
        two = (TextView) findViewById(R.id.two);
        three = (TextView) findViewById(R.id.three);
        four = (TextView) findViewById(R.id.four);
        five = (TextView) findViewById(R.id.five);
        six = (TextView) findViewById(R.id.six);
        seven = (TextView) findViewById(R.id.seven);
        eight = (TextView) findViewById(R.id.eight);
        nine = (TextView) findViewById(R.id.nine);
        ten= (TextView) findViewById(R.id.ten);
        eleven= (TextView) findViewById(R.id.eleven);
        twelve = (TextView) findViewById(R.id.twelve);
        thirteen = (TextView) findViewById(R.id.thirteen);
        fourteen = (TextView) findViewById(R.id.fourteen);
        fifteen = (TextView) findViewById(R.id.fifteen);
        sixteen = (TextView) findViewById(R.id.sixteen);
        seventeen = (TextView) findViewById(R.id.seventeen);
        eighteen = (TextView) findViewById(R.id.eighteen);
        nineteen = (TextView) findViewById(R.id.nineteen);
        twenty = (TextView) findViewById(R.id.twenty);
        twentyone = (TextView) findViewById(R.id.twentyone);
        twentytwo = (TextView) findViewById(R.id.twentytwo);
        twentythree = (TextView) findViewById(R.id.twentythree);
        twentythree = (TextView) findViewById(R.id.twentythree);
        twentyfour = (TextView) findViewById(R.id.twentyfour);
        twentyfive = (TextView) findViewById(R.id.twentyfive);
        twentysix = (TextView) findViewById(R.id.twentysix);
        twentyseven = (TextView) findViewById(R.id.twentyseven);
        twentyeight = (TextView) findViewById(R.id.twentyeight);
        twentynine = (TextView) findViewById(R.id.twentynine);
        thirty = (TextView) findViewById(R.id.thirty);
        thirtyone = (TextView) findViewById(R.id.thirtyone);
        egg2 = (TextView) findViewById(R.id.egg2);


        txtmoral = (TextView) findViewById(R.id.txtmoral);

        txthunter = (TextView) findViewById(R.id.txthunter);

        txtstorm1 = (TextView) findViewById(R.id.txtstorm1);

        txtstorm2 = (TextView) findViewById(R.id.txtstorm2);


        final FirebaseDatabase mDatabase = FirebaseDatabase.getInstance();
        final DatabaseReference databaseReference = mDatabase.getReference();

        btnStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mDatabase.getReference("one").addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                        String Value = dataSnapshot.child("text").getValue(String.class);
                        one.setText(Value);
                        String image = dataSnapshot.child("img").getValue(String.class);
                        Picasso.with(Second.this)
                                .load(image).fit().centerCrop().into(oneimg);
                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError databaseError) {

                    }
                });

                mDatabase.getReference("two").addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                        String Value = dataSnapshot.child("text").getValue(String.class);
                        two.setText(Value);
                        String image = dataSnapshot.child("img").getValue(String.class);
                        Picasso.with(Second.this)
                                .load(image).fit().centerCrop().into(twoimg);
                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError databaseError) {

                    }
                });

                mDatabase.getReference("three").addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                        String Value = dataSnapshot.child("text").getValue(String.class);
                        three.setText(Value);
                        String image = dataSnapshot.child("img").getValue(String.class);
                        Picasso.with(Second.this)
                                .load(image).fit().centerCrop().into(threeimg);
                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError databaseError) {

                    }
                });

                mDatabase.getReference("four").addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                        String Value = dataSnapshot.child("text").getValue(String.class);
                        four.setText(Value);
                        String image = dataSnapshot.child("img").getValue(String.class);
                        Picasso.with(Second.this)
                                .load(image).fit().centerCrop().into(fourimg);
                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError databaseError) {

                    }
                });

                mDatabase.getReference("five").addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                        String Value = dataSnapshot.child("text").getValue(String.class);
                        five.setText(Value);
                        String image = dataSnapshot.child("img").getValue(String.class);
                        Picasso.with(Second.this)
                                .load(image).fit().centerCrop().into(fiveimg);
                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError databaseError) {

                    }
                });

                txtstorm1.setVisibility(View.VISIBLE);
                btnNo.setVisibility(View.VISIBLE);
                btnYes.setVisibility(View.VISIBLE);

            }
        });

        btnNo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mDatabase.getReference("no").addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                        String Value = dataSnapshot.child("text").getValue(String.class);
                        six.setText(Value);
                        six.setVisibility(View.VISIBLE);
                        siximg.setVisibility(View.INVISIBLE);
                        seven.setVisibility(View.INVISIBLE);
                        sevenimg.setVisibility(View.INVISIBLE);
                        eight.setVisibility(View.INVISIBLE);
                        eightimg.setVisibility(View.INVISIBLE);
                        txthunter.setVisibility(View.INVISIBLE);
                        btnBack.setVisibility(View.INVISIBLE);
                        btnTake.setVisibility(View.INVISIBLE);
                        //String image = dataSnapshot.child("img").getValue(String.class);
                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError databaseError) {

                    }
                });
            }
        });

        btnYes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mDatabase.getReference("six").addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                        String Value = dataSnapshot.child("text").getValue(String.class);
                        six.setText(Value);
                        String image = dataSnapshot.child("img").getValue(String.class);
                        Picasso.with(Second.this)
                                .load(image).fit().centerCrop().into(siximg);

                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError databaseError) {

                    }
                });

                six.setVisibility(View.VISIBLE);
                siximg.setVisibility(View.VISIBLE);

                mDatabase.getReference("seven").addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                        String Value = dataSnapshot.child("text").getValue(String.class);
                        seven.setText(Value);
                        String image = dataSnapshot.child("img").getValue(String.class);
                        Picasso.with(Second.this)
                                .load(image).fit().centerCrop().into(sevenimg);
                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError databaseError) {

                    }
                });

                seven.setVisibility(View.VISIBLE);
                sevenimg.setVisibility(View.VISIBLE);

                mDatabase.getReference("eight").addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                        String Value = dataSnapshot.child("text").getValue(String.class);
                        eight.setText(Value);
                        String image = dataSnapshot.child("img").getValue(String.class);
                        Picasso.with(Second.this)
                                .load(image).fit().centerCrop().into(eightimg);
                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError databaseError) {

                    }
                });

                eight.setVisibility(View.VISIBLE);
                eightimg.setVisibility(View.VISIBLE);

                txthunter.setVisibility(View.VISIBLE);
                btnBack.setVisibility(View.VISIBLE);
                btnTake.setVisibility(View.VISIBLE);

            }
        });

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mDatabase.getReference("no").addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                        String Value = dataSnapshot.child("text").getValue(String.class);
                        nine.setText(Value);
                        nine.setVisibility(View.VISIBLE);
                        nineimg.setVisibility(View.INVISIBLE);
                        ten.setVisibility(View.INVISIBLE);
                        tenimg.setVisibility(View.INVISIBLE);
                        eleven.setVisibility(View.INVISIBLE);
                        elevenimg.setVisibility(View.INVISIBLE);
                        twelve.setVisibility(View.INVISIBLE);
                        twelveimg.setVisibility(View.INVISIBLE);

                        txtstorm2.setVisibility(View.INVISIBLE);
                        btnYes2.setVisibility(View.INVISIBLE);
                        btnNo2.setVisibility(View.INVISIBLE);
                        //String image = dataSnapshot.child("img").getValue(String.class);
                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError databaseError) {

                    }
                });

            }
        });

       btnTake.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {

               mDatabase.getReference("nine").addValueEventListener(new ValueEventListener() {
                   @Override
                   public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                       String Value = dataSnapshot.child("text").getValue(String.class);
                       nine.setText(Value);
                       String image = dataSnapshot.child("img").getValue(String.class);
                       Picasso.with(Second.this)
                               .load(image).fit().centerCrop().into(nineimg);
                   }

                   @Override
                   public void onCancelled(@NonNull DatabaseError databaseError) {

                   }
               });

               nine.setVisibility(View.VISIBLE);
               nineimg.setVisibility(View.VISIBLE);

               mDatabase.getReference("ten").addValueEventListener(new ValueEventListener() {
                   @Override
                   public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                       String Value = dataSnapshot.child("text").getValue(String.class);
                       ten.setText(Value);
                       String image = dataSnapshot.child("img").getValue(String.class);
                       Picasso.with(Second.this)
                               .load(image).fit().centerCrop().into(tenimg);
                   }

                   @Override
                   public void onCancelled(@NonNull DatabaseError databaseError) {

                   }
               });

               ten.setVisibility(View.VISIBLE);
               tenimg.setVisibility(View.VISIBLE);

               mDatabase.getReference("eleven").addValueEventListener(new ValueEventListener() {
                   @Override
                   public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                       String Value = dataSnapshot.child("text").getValue(String.class);
                       eleven.setText(Value);
                       String image = dataSnapshot.child("img").getValue(String.class);
                       Picasso.with(Second.this)
                               .load(image).fit().centerCrop().into(elevenimg);
                   }

                   @Override
                   public void onCancelled(@NonNull DatabaseError databaseError) {

                   }
               });

               eleven.setVisibility(View.VISIBLE);
               elevenimg.setVisibility(View.VISIBLE);

               mDatabase.getReference("twelve").addValueEventListener(new ValueEventListener() {
                   @Override
                   public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                       String Value = dataSnapshot.child("text").getValue(String.class);
                       twelve.setText(Value);
                       String image = dataSnapshot.child("img").getValue(String.class);
                       Picasso.with(Second.this)
                               .load(image).fit().centerCrop().into(twelveimg);
                   }

                   @Override
                   public void onCancelled(@NonNull DatabaseError databaseError) {

                   }
               });

               twelve.setVisibility(View.VISIBLE);
               twelveimg.setVisibility(View.VISIBLE);

               txtstorm2.setVisibility(View.VISIBLE);
               btnYes2.setVisibility(View.VISIBLE);
               btnNo2.setVisibility(View.VISIBLE);
           }
       });


       btnNo2.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               mDatabase.getReference("no").addValueEventListener(new ValueEventListener() {
                   @Override
                   public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                       String Value = dataSnapshot.child("text").getValue(String.class);
                       egg2.setText(Value);
                       egg2.setVisibility(View.VISIBLE);
                       egg2img.setVisibility(View.INVISIBLE);

                       thirteen.setVisibility(View.INVISIBLE);
                       fourteen.setVisibility(View.INVISIBLE);
                       fifteen.setVisibility(View.INVISIBLE);
                       sixteen.setVisibility(View.INVISIBLE);
                       seventeen.setVisibility(View.INVISIBLE);
                       eighteen.setVisibility(View.INVISIBLE);
                       nineteen.setVisibility(View.INVISIBLE);
                       twenty.setVisibility(View.INVISIBLE);
                       twentyone.setVisibility(View.INVISIBLE);
                       twentytwo.setVisibility(View.INVISIBLE);
                       twentythree.setVisibility(View.INVISIBLE);
                       twentyfour.setVisibility(View.INVISIBLE);
                       twentyfive.setVisibility(View.INVISIBLE);
                       twentysix.setVisibility(View.INVISIBLE);
                       twentyseven.setVisibility(View.INVISIBLE);
                       twentyeight.setVisibility(View.INVISIBLE);
                       twentynine.setVisibility(View.INVISIBLE);
                       thirty.setVisibility(View.INVISIBLE);
                       thirtyone.setVisibility(View.INVISIBLE);

                       thirteenimg.setVisibility(View.INVISIBLE);
                       fourteenimg.setVisibility(View.INVISIBLE);
                       fifteenimg.setVisibility(View.INVISIBLE);
                       sixteenimg.setVisibility(View.INVISIBLE);
                       seventeenimg.setVisibility(View.INVISIBLE);
                       eighteenimg.setVisibility(View.INVISIBLE);
                       nineteenimg.setVisibility(View.INVISIBLE);
                       twentyimg.setVisibility(View.INVISIBLE);
                       twentyoneimg.setVisibility(View.INVISIBLE);
                       twentytwoimg.setVisibility(View.INVISIBLE);
                       twentythreeimg.setVisibility(View.INVISIBLE);
                       twentyfourimg.setVisibility(View.INVISIBLE);
                       twentyfiveimg.setVisibility(View.INVISIBLE);
                       twentysiximg.setVisibility(View.INVISIBLE);
                       twentysevenimg.setVisibility(View.INVISIBLE);
                       twentyeightimg.setVisibility(View.INVISIBLE);
                       twentynineimg.setVisibility(View.INVISIBLE);
                       thirtyimg.setVisibility(View.INVISIBLE);
                       thirtyoneimg.setVisibility(View.INVISIBLE);
                       //String image = dataSnapshot.child("img").getValue(String.class);
                   }

                   @Override
                   public void onCancelled(@NonNull DatabaseError databaseError) {

                   }
               });

           }
       });

    btnYes2.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {

            mDatabase.getReference("egg2").addValueEventListener(new ValueEventListener() {
                @Override
                public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                    String Value = dataSnapshot.child("text").getValue(String.class);
                    egg2.setText(Value);
                    String image = dataSnapshot.child("img").getValue(String.class);
                    Picasso.with(Second.this)
                            .load(image).fit().centerCrop().into(egg2img);
                }

                @Override
                public void onCancelled(@NonNull DatabaseError databaseError) {

                }
            });

            egg2.setVisibility(View.VISIBLE);
            egg2img.setVisibility(View.VISIBLE);

            mDatabase.getReference("thirteen").addValueEventListener(new ValueEventListener() {
                @Override
                public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                    String Value = dataSnapshot.child("text").getValue(String.class);
                    thirteen.setText(Value);
                    String image = dataSnapshot.child("img").getValue(String.class);
                    Picasso.with(Second.this)
                            .load(image).fit().centerCrop().into(thirteenimg);
                }

                @Override
                public void onCancelled(@NonNull DatabaseError databaseError) {

                }
            });

            thirteen.setVisibility(View.VISIBLE);
            thirteenimg.setVisibility(View.VISIBLE);

            mDatabase.getReference("fourteen").addValueEventListener(new ValueEventListener() {
                @Override
                public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                    String Value = dataSnapshot.child("text").getValue(String.class);
                    fourteen.setText(Value);
                    String image = dataSnapshot.child("img").getValue(String.class);
                    Picasso.with(Second.this)
                            .load(image).fit().centerCrop().into(fourteenimg);
                }

                @Override
                public void onCancelled(@NonNull DatabaseError databaseError) {

                }
            });

            fourteen.setVisibility(View.VISIBLE);
            fourteenimg.setVisibility(View.VISIBLE);

            mDatabase.getReference("fifteen").addValueEventListener(new ValueEventListener() {
                @Override
                public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                    String Value = dataSnapshot.child("text").getValue(String.class);
                    fifteen.setText(Value);
                    String image = dataSnapshot.child("img").getValue(String.class);
                    Picasso.with(Second.this)
                            .load(image).fit().centerCrop().into(fifteenimg);
                }

                @Override
                public void onCancelled(@NonNull DatabaseError databaseError) {

                }
            });

            fifteen.setVisibility(View.VISIBLE);
            fifteenimg.setVisibility(View.VISIBLE);

            mDatabase.getReference("sixteen").addValueEventListener(new ValueEventListener() {
                @Override
                public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                    String Value = dataSnapshot.child("text").getValue(String.class);
                    sixteen.setText(Value);
                    String image = dataSnapshot.child("img").getValue(String.class);
                    Picasso.with(Second.this)
                            .load(image).fit().centerCrop().into(sixteenimg);
                }

                @Override
                public void onCancelled(@NonNull DatabaseError databaseError) {

                }
            });

            sixteen.setVisibility(View.VISIBLE);
            sixteenimg.setVisibility(View.VISIBLE);

            mDatabase.getReference("seventeen").addValueEventListener(new ValueEventListener() {
                @Override
                public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                    String Value = dataSnapshot.child("text").getValue(String.class);
                    seventeen.setText(Value);
                    String image = dataSnapshot.child("img").getValue(String.class);
                    Picasso.with(Second.this)
                            .load(image).fit().centerCrop().into(seventeenimg);
                }

                @Override
                public void onCancelled(@NonNull DatabaseError databaseError) {

                }
            });
            seventeen.setVisibility(View.VISIBLE);
            seventeenimg.setVisibility(View.VISIBLE);

            mDatabase.getReference("eighteen").addValueEventListener(new ValueEventListener() {
                @Override
                public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                    String Value = dataSnapshot.child("text").getValue(String.class);
                    eighteen.setText(Value);
                    String image = dataSnapshot.child("img").getValue(String.class);
                    Picasso.with(Second.this)
                            .load(image).fit().centerCrop().into(eighteenimg);
                }

                @Override
                public void onCancelled(@NonNull DatabaseError databaseError) {

                }
            });

            eighteen.setVisibility(View.VISIBLE);
            eighteenimg.setVisibility(View.VISIBLE);

            mDatabase.getReference("nineteen").addValueEventListener(new ValueEventListener() {
                @Override
                public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                    String Value = dataSnapshot.child("text").getValue(String.class);
                    nineteen.setText(Value);
                    String image = dataSnapshot.child("img").getValue(String.class);
                    Picasso.with(Second.this)
                            .load(image).fit().centerCrop().into(nineteenimg);
                }

                @Override
                public void onCancelled(@NonNull DatabaseError databaseError) {

                }
            });

            nineteen.setVisibility(View.VISIBLE);
            nineteenimg.setVisibility(View.VISIBLE);

            mDatabase.getReference("twenty").addValueEventListener(new ValueEventListener() {
                @Override
                public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                    String Value = dataSnapshot.child("text").getValue(String.class);
                    twenty.setText(Value);
                    String image = dataSnapshot.child("img").getValue(String.class);
                    Picasso.with(Second.this)
                            .load(image).fit().centerCrop().into(twentyimg);
                }

                @Override
                public void onCancelled(@NonNull DatabaseError databaseError) {

                }
            });

            twenty.setVisibility(View.VISIBLE);
            twentyimg.setVisibility(View.VISIBLE);

            mDatabase.getReference("twentyone").addValueEventListener(new ValueEventListener() {
                @Override
                public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                    String Value = dataSnapshot.child("text").getValue(String.class);
                    twentyone.setText(Value);
                    String image = dataSnapshot.child("img").getValue(String.class);
                    Picasso.with(Second.this)
                            .load(image).fit().centerCrop().into(twentyoneimg);
                }

                @Override
                public void onCancelled(@NonNull DatabaseError databaseError) {

                }
            });

            twentyone.setVisibility(View.VISIBLE);
            twentyoneimg.setVisibility(View.VISIBLE);

            mDatabase.getReference("twentytwo").addValueEventListener(new ValueEventListener() {
                @Override
                public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                    String Value = dataSnapshot.child("text").getValue(String.class);
                    twentytwo.setText(Value);
                    String image = dataSnapshot.child("img").getValue(String.class);
                    Picasso.with(Second.this)
                            .load(image).fit().centerCrop().into(twentytwoimg);
                }

                @Override
                public void onCancelled(@NonNull DatabaseError databaseError) {

                }
            });

            twentytwo.setVisibility(View.VISIBLE);
            twentytwoimg.setVisibility(View.VISIBLE);

            mDatabase.getReference("twentythree").addValueEventListener(new ValueEventListener() {
                @Override
                public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                    String Value = dataSnapshot.child("text").getValue(String.class);
                    twentythree.setText(Value);
                    String image = dataSnapshot.child("img").getValue(String.class);
                    Picasso.with(Second.this)
                            .load(image).fit().centerCrop().into(twentythreeimg);
                }

                @Override
                public void onCancelled(@NonNull DatabaseError databaseError) {

                }
            });

            twentythree.setVisibility(View.VISIBLE);
            twentythreeimg.setVisibility(View.VISIBLE);

            mDatabase.getReference("twentyfour").addValueEventListener(new ValueEventListener() {
                @Override
                public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                    String Value = dataSnapshot.child("text").getValue(String.class);
                    twentyfour.setText(Value);
                    String image = dataSnapshot.child("img").getValue(String.class);
                    Picasso.with(Second.this)
                            .load(image).fit().centerCrop().into(twentyfourimg);
                }

                @Override
                public void onCancelled(@NonNull DatabaseError databaseError) {

                }
            });

            twentyfour.setVisibility(View.VISIBLE);
            twentyfourimg.setVisibility(View.VISIBLE);

            mDatabase.getReference("twentyfive").addValueEventListener(new ValueEventListener() {
                @Override
                public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                    String Value = dataSnapshot.child("text").getValue(String.class);
                    twentyfive.setText(Value);
                    String image = dataSnapshot.child("img").getValue(String.class);
                    Picasso.with(Second.this)
                            .load(image).fit().centerCrop().into(twentyfiveimg);
                }

                @Override
                public void onCancelled(@NonNull DatabaseError databaseError) {

                }
            });

            twentyfive.setVisibility(View.VISIBLE);
            twentyfiveimg.setVisibility(View.VISIBLE);

            mDatabase.getReference("twentysix").addValueEventListener(new ValueEventListener() {
                @Override
                public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                    String Value = dataSnapshot.child("text").getValue(String.class);
                    twentysix.setText(Value);
                    String image = dataSnapshot.child("img").getValue(String.class);
                    Picasso.with(Second.this)
                            .load(image).fit().centerCrop().into(twentysiximg);
                }

                @Override
                public void onCancelled(@NonNull DatabaseError databaseError) {

                }
            });

            twentysix.setVisibility(View.VISIBLE);
            twentysiximg.setVisibility(View.VISIBLE);

            mDatabase.getReference("twentyseven").addValueEventListener(new ValueEventListener() {
                @Override
                public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                    String Value = dataSnapshot.child("text").getValue(String.class);
                    twentyseven.setText(Value);
                    String image = dataSnapshot.child("img").getValue(String.class);
                    Picasso.with(Second.this)
                            .load(image).fit().centerCrop().into(twentysevenimg);
                }

                @Override
                public void onCancelled(@NonNull DatabaseError databaseError) {

                }
            });

            twentyseven.setVisibility(View.VISIBLE);
            twentysevenimg.setVisibility(View.VISIBLE);

            mDatabase.getReference("twentyeight").addValueEventListener(new ValueEventListener() {
                @Override
                public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                    String Value = dataSnapshot.child("text").getValue(String.class);
                    twentyeight.setText(Value);
                    String image = dataSnapshot.child("img").getValue(String.class);
                    Picasso.with(Second.this)
                            .load(image).fit().centerCrop().into(twentyeightimg);
                }

                @Override
                public void onCancelled(@NonNull DatabaseError databaseError) {

                }
            });

            twentyeight.setVisibility(View.VISIBLE);
            twentyeightimg.setVisibility(View.VISIBLE);

            mDatabase.getReference("twentynine").addValueEventListener(new ValueEventListener() {
                @Override
                public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                    String Value = dataSnapshot.child("text").getValue(String.class);
                    twentynine.setText(Value);
                    String image = dataSnapshot.child("img").getValue(String.class);
                    Picasso.with(Second.this)
                            .load(image).fit().centerCrop().into(twentynineimg);
                }

                @Override
                public void onCancelled(@NonNull DatabaseError databaseError) {

                }
            });

            twentynine.setVisibility(View.VISIBLE);
            twentynineimg.setVisibility(View.VISIBLE);

            mDatabase.getReference("thirty").addValueEventListener(new ValueEventListener() {
                @Override
                public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                    String Value = dataSnapshot.child("text").getValue(String.class);
                    thirty.setText(Value);
                    String image = dataSnapshot.child("img").getValue(String.class);
                    Picasso.with(Second.this)
                            .load(image).fit().centerCrop().into(thirtyimg);
                }

                @Override
                public void onCancelled(@NonNull DatabaseError databaseError) {

                }
            });

            thirty.setVisibility(View.VISIBLE);
            thirtyimg.setVisibility(View.VISIBLE);

            mDatabase.getReference("thirtyone").addValueEventListener(new ValueEventListener() {
                @Override
                public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                    String Value = dataSnapshot.child("text").getValue(String.class);
                    thirtyone.setText(Value);
                    String image = dataSnapshot.child("img").getValue(String.class);
                    Picasso.with(Second.this)
                            .load(image).fit().centerCrop().into(thirtyoneimg);
                }

                @Override
                public void onCancelled(@NonNull DatabaseError databaseError) {

                }
            });

            thirtyone.setVisibility(View.VISIBLE);
            thirtyoneimg.setVisibility(View.VISIBLE);

            mDatabase.getReference("moral").addValueEventListener(new ValueEventListener() {
                @Override
                public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                    String Value = dataSnapshot.child("text").getValue(String.class);
                    txtmoral.setText(Value);

                }

                @Override
                public void onCancelled(@NonNull DatabaseError databaseError) {

                }
            });

            txtmoral.setVisibility(View.VISIBLE);

        }
    });



        }

}
