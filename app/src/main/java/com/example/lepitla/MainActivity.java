package com.example.lepitla;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;


//Recycler view adapter class


class RecyclerAdapter extends RecyclerView.Adapter < RecyclerAdapter.ViewHolder > {
    String[] data;
    String[] data1;
    int[]    data2;
    Context  context, context1, context2;

    public
    RecyclerAdapter ( Context context, String[] data, Context context1, String[] data1, Context context2, int[] data2 ) {
        this.data    = data;
        this.context = context;

        this.data1    = data1;
        this.context1 = context1;

        this.data2    = data2;
        this.context2 = context2;
    }


    @NonNull
    @Override
    public
    RecyclerAdapter.ViewHolder onCreateViewHolder ( @NonNull ViewGroup parent, int viewType ) {
        LayoutInflater layoutInflater = LayoutInflater.from ( parent.getContext ( ) );
        View view = layoutInflater.inflate ( R.layout.card_layout, parent, false );
        ViewHolder viewHolder = new ViewHolder ( view );
        return viewHolder;
    }

    @Override
    public
    void onBindViewHolder ( @NonNull RecyclerAdapter.ViewHolder holder, int position ) {
        holder.textView1.setText ( data[ position ] );
        holder.textView2.setText ( data1[ position ] );
        holder.img.setImageResource ( data2[ position ] );
        holder.textView1.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public
            void onClick ( View v ) {
                Intent intent = new Intent ( context, Detail.class );

                if ( position == 0 ) {
                    intent.putExtra ( "message1", "KATSE DAM, a concrete arch dam on the Malibamat'so River in Lesotho, is Africa's second largest double-curvature arch dam." );
                    intent.putExtra ( "message2", " The dam is part of the Lesotho Highlands Water Project, which will eventually include five large dams in remote rural areas." );
                    intent.putExtra ( "message3", "The KATSE DAM, a concrete arch dam on the Malibamat'so River in Lesotho, is Africa's second largest double-curvature arch dam. " );
                    intent.putExtra ( "name", data2[ position ] );

                }
                else if ( position == 1 ) {
                    intent.putExtra ( "message1", "THE SEHLABATHEBE nationsl park,is located in the Maloti Mountains in Qacha's Nek District and is part of the larger Maloti-Drakensberg World Heritage site." );
                    intent.putExtra ( "message2", "The national park is home to both striking biological diversity as well as important cultural heritage. The site has been classified as a National Heritage Site." );
                    intent.putExtra ( "message3", "The Sehlabathebe National Park was first established on May 8, 1969." );
                    intent.putExtra ( "name", data2[ position ] );

                }
                else if ( position == 2 ) {
                    intent.putExtra ( "message1", "THABA-BOSIU is a national monument and Lesotho's foremost tourist destination holding great historical significance as the birthplace of the Basotho people." );
                    intent.putExtra ( "message2", "It is the sandstone plateu where King Moshoeshoe 1, the Basotho Nation founder established what turned out to the formidable fortress that protected his people during Lifaqane war." );
                    intent.putExtra ( "message3", "It is located 24km outside of city of Maseru." );
                    intent.putExtra ( "name", data2[ position ] );

                }
                else if ( position == 3 ) {
                    intent.putExtra ( "message1", "THE MALETSUNYANE WATER FALL, is a 192-metre-high water fall in the Southern African country Lesotho. It is located near the town of Semonkong, which also is named after the falls. " );
                    intent.putExtra ( "message2", "The plunging water creates a reverberating echo when is contact the basin of the falls, and local legend has it that the sound comes from the wailing of the people who have drowned in the falls and has the lodge nearby." );
                    intent.putExtra ( "message3", "The Lodge together with the local community provides ponies and guides for day trips to the Maletsunyane Falls." );
                    intent.putExtra ( "name", data2[ position ] );

                }

                else if ( position == 4 ) {
                    intent.putExtra ( "message1", "THE MALIBAMATSO RIVER is a river in northern Lesotho. Its origin is near to the South African border, where it drains the eastern slopes of the Maloti Range. It flows southwards past the village of Lejone, and eventually joins the Senqu River kilometers northeast of Mohlanapeng." );
                    intent.putExtra ( "message2", "It forms the northern arm of the Katse dam reservoir, a part of the Lesotho Highlands Water Project." );
                    intent.putExtra ( "message3", "It has bank tributaries which are the Matsoku and Semenanyane Rivers ." );
                    intent.putExtra ( "name", data2[ position ] );

                }
                else if ( position == 5 ) {
                    intent.putExtra ( "message1", "The TSEHLANYANE NATIONAL PARK is a national park in LESOTHO. It is located in the Maloti Mountains in Leribe district, and is part of the larger Maloti-Drankensberg Transfrontier Conservation Area. " );
                    intent.putExtra ( "message2", "This Lesotho northern park protects a high-altitude, 2600-metre(8,500 ft) patch of rugged wilderness, including one of Lesotho's only stands of indigenous forest with a number of rare undergrowth plants that are unique to this woodland habitat." );
                    intent.putExtra ( "message3", " The name 'Ts'hehlanyane' is the local common for the berg bamboo from which the river and park take their name. It is fitting that the park should bear the name of this Drankensberg endemic plant. " );
                    intent.putExtra ( "name", data2[ position ] );

                }
                else if ( position == 6 ) {
                    intent.putExtra ( "message1", "LETSENG DIAMOND MINE is located in the Maluti Mountains of Lesotho and is renowned for its recovery of large, high quality, exceptional Type 2 diamonds ." );
                    intent.putExtra ( "message2", "It comprises two 91 Ma kimberlite pipes." );
                    intent.putExtra ( "message3", "Is most popular for quality diamonds" );
                    intent.putExtra ( "name", data2[ position ] );


                    Toast.makeText ( context, data[ position ], Toast.LENGTH_SHORT ).show ( );
                context.startActivity ( intent );
            }
        } );
    }

    @Override
    public
    int getItemCount ( ) {

        return data.length;
    }

    public
    class ViewHolder extends RecyclerView.ViewHolder {

        TextView textView1, textView2;
        ImageView img;

        public
        ViewHolder ( @NonNull View itemView ) {

            super ( itemView );
            textView1 = itemView.findViewById ( R.id.name );
            textView2 = itemView.findViewById ( R.id.desc );
            img       = itemView.findViewById ( R.id.img );

        }
    }
}

//class for main activity

public
class MainActivity extends AppCompatActivity {

    RecyclerView    recyclerView;
    RecyclerAdapter adapter;

    String tittles[] = {"KATSE DAM","SEHLABATHEBE NATIONAL PARK","THABA-BOSIU","MALETSUNAYANE FALLS","MALIBAMATSO RIVER","TSEHLANYANE NATIONAL PARK ","LETSENG DIAMOND MINE"};
    int [] imagesResources = {R.drawable.katse, R.drawable.letsa, R.drawable.sehla, R.drawable.maletsunyane, R.drawable.thabanamorena, R.drawable.thababosiu, R.drawable.maliba};
    String subTittle[] = {"HUGE DAM", "NATURE RESERVE", "HISTORICAL PLACE","WATERFALL","BIG RIVER","NATURE RESERVE ","DIAMOND MINE."};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recycler);
        recyclerView.setLayoutManager(new LinearLayoutManager ( this));
        adapter = new RecyclerAdapter(this, tittles, this, subTittle, this, imagesResources);
        recyclerView.setAdapter(adapter);

    }
}