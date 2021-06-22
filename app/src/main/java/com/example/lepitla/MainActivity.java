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
                    intent.putExtra ( "message1", "The Katse Dam, a concrete arch dam on the Malibamat'so River in Lesotho, is Africa's second largest double-curvature arch dam." );
                    intent.putExtra ( "message2", " The dam is part of the Lesotho Highlands Water Project, which will eventually include five large dams in remote rural areas." );
                    intent.putExtra ( "message3", "The Katse Dam, a concrete arch dam on the Malibamat'so River in Lesotho, is Africa's second largest double-curvature arch dam. " );
                    intent.putExtra ( "name", data2[ position ] );

                }
                else if ( position == 1 ) {
                    intent.putExtra ( "message1", "The Kome Caves are a group of cave dwellings made out of mud in the district of Berea, Lesotho 25 km east of Teyateyaneng." );
                    intent.putExtra ( "message2", "The caves are still inhabited by the descendants of the original people who built the caves. The site has been classified as a National Heritage Site." );
                    intent.putExtra ( "message3", "The Kome Cave Dwellings were built and protected by Chief Teleka of The Basia(cat) Clan in the early 19th century." );
                    intent.putExtra ( "name", data2[ position ] );

                }
                else if ( position == 2 ) {
                    intent.putExtra ( "message1", "Bokong Nature Reserve is one of the highest reserves in Africa. It lies at the top of the Mafika-Lisiu Pass, leading to Katse Dam and reaches an altitude of 3090m above sea level." );
                    intent.putExtra ( "message2", "There are some outstanding views across the highlands. However, the reserves highlight is the Lepaqoa Waterfall, which freezes in winter to form a column of ice." );
                    intent.putExtra ( "message3", "The visitors’ centre (open between 08:00 and 17:00 daily) at the Bokong Nature Reserve is perched on the edge of a 100m cliff, was built with the aim of educating visitors to the kingdom about the ecology." );
                    intent.putExtra ( "name", data2[ position ] );

                }
                else if ( position == 3 ) {
                    intent.putExtra ( "message1", "Maletsunyane Waterfalls, one of the highest single dropping waterfalls in the Southern Hemisphere, plummets 192 metres into a spectacular gorge creating clouds of spray visible from afar. " );
                    intent.putExtra ( "message2", "Semonkong Lodge offers you the chance to explore the magnificent scenery and culture of Lesotho." );
                    intent.putExtra ( "message3", "The Lodge together with the local community provides ponies and guides for day trips to the Maletsunyane Falls." );
                    intent.putExtra ( "name", data2[ position ] );

                }
                else if ( position == 4 ) {
                    intent.putExtra ( "message1", "Found in the highlands of Lesotho, the Maluti Mountains, also spelled Maloti, form the border between Lesotho and South Africa." );
                    intent.putExtra ( "message2", "Here you can find snow or frost on the highest peaks almost all year round and you can usually enjoy skiing between the months of May and July when the snow is plentiful." );
                    intent.putExtra ( "message3", "The mountains offer many other activities from hiking, mountain biking, mountain climbing and there are many 4x4 trails to keep your adrenalin going" );
                    intent.putExtra ( "name", data2[ position ] );

                }
                else if ( position == 5 ) {
                    intent.putExtra ( "message1", "Thaba Bosiu lies at the historic and spiritual heart of the Sotho Kingdom. Rising to an altitude of 1,800m only 20km east of Maseru, this near-impregnable sandstone plateau served as the residence and military stronghold of Moshoeshoe I" );
                    intent.putExtra ( "message2", "Thaba-Bosiu National Monument is a plateau situated in the Phuthiatsana Valley, about 23km south-east of Maseru, the capital city." );
                    intent.putExtra ( "message3", " It was named Thaba-Bosiu (mountain at night) during the occupation of Moshoeshoe 1, founder of the Basotho nation in 1824." );
                    intent.putExtra ( "name", data2[ position ] );

                }
                else if ( position == 6 ) {
                    intent.putExtra ( "message1", "Thabana Ntlenyana, also called Thadentsonyane, Thabantshonyana, or Mount Ntlenyana, mountain peak (11,424 feet [3,482 m]) in the Drakensberg" );
                    intent.putExtra ( "message2", "The peak lies in Lesotho, an independent country entirely within South Africa, just west of the border with the province of KwaZulu-Natal." );
                    intent.putExtra ( "message3", " Nearby are the headwaters of the Orange River, which flows west to the Atlantic Ocean." );
                    intent.putExtra ( "name", data2[ position ] );

                }

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

    String tittles[] = {"KATSE","KOME CAVES","BOKONG","MALETSUNAYANE","MALUTI MOUNTAINS","THABABOSIU","THABANA NTLENYANA"};
    int [] imagesResources = {R.drawable.katse, R.drawable.komecaves, R.drawable.bokong, R.drawable.maletsunyane, R.drawable.malutimountains, R.drawable.thababosiu, R.drawable.thabanantlenyana};
    String subTittle[] = {"Big damn", "Caves", "Nature researve","192m tall falls","Lofty mountain range of Lesotho","Military remains & a recreated village","Landmark summit & hiking route"};

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