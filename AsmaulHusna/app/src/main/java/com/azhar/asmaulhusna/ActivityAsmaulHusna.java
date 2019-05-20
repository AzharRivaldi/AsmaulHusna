package com.azhar.asmaulhusna;


import android.content.DialogInterface;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import com.azhar.asmaulhusna.adapter.RecyclerViewAdapter;
import com.azhar.asmaulhusna.adapter.RecyclerViewAdapterBacaan;

import java.util.ArrayList;
import java.util.List;

public class ActivityAsmaulHusna extends AppCompatActivity {

    RecyclerView recyclerView, recyclerView1;
    RecyclerViewAdapter recyclerViewAdapter;
    RecyclerViewAdapterBacaan recyclerViewAdapterBacaan;
    RecyclerView.LayoutManager recyclerViewLayoutManager;
    RecyclerView.LayoutManager recyclerViewLayoutManager1;
    MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_asmaul_husna);
        setTitle("Asmaul Husna");

        mediaPlayer = MediaPlayer.create(ActivityAsmaulHusna.this, R.raw.asmaul_husna);

        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        recyclerView1 = (RecyclerView) findViewById(R.id.recycler_view1);
        recyclerView.setNestedScrollingEnabled(true);

        //Change 2 to your choice because here 2 is the number of Grid layout Columns in each row.
        recyclerViewLayoutManager = new GridLayoutManager(this, 1);
        recyclerViewLayoutManager.setAutoMeasureEnabled(true);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(recyclerViewLayoutManager);
        recyclerViewAdapter = new RecyclerViewAdapter(getApplicationContext(), getUserInformation());
        recyclerView.setAdapter(recyclerViewAdapter);

        recyclerViewLayoutManager1 = new GridLayoutManager(this, 1);
        recyclerViewLayoutManager1.setAutoMeasureEnabled(true);
        recyclerView1.setHasFixedSize(true);
        recyclerView1.setLayoutManager(recyclerViewLayoutManager1);
        recyclerViewAdapterBacaan = new RecyclerViewAdapterBacaan(getApplicationContext(), getUserInformationn());
        recyclerView1.setAdapter(recyclerViewAdapterBacaan);

    }

    private List<User2> getUserInformationn() {
        List<User2> userList = new ArrayList<User2>();
        userList.add(new User2("أشهد أن لا اله الا الله وأشهد ان محمد رسول الله", "Asyhadu an laa ilaaha illallāh wa asyhadu anna Muhammad Rasuulullāh.", "Aku bersaksi bahwa tiada Tuhan melainkan Allah dan Aku bersaksi Nabi Muhammad utusan Allah."));
        userList.add(new User2("اللهُمَّ صَلِّ عَلَى مُحَمَّد     يَارَبِّ صَلِّ عَلَيْهِ وَسَلِّم", "Allahumma sholli ala muhammad ya robbi sholli alaihi wasallim", "Ya Allah, limpahkanlah rahmat atas Nabi Muhammad Ya Tuhanku, limpahkanlah rahmat dan kesejahteraan atas beliau"));
        userList.add(new User2("وَلِلَّهِ الْأَسْمَاءُ الْحُسْنَىٰ فَادْعُوهُ بِهَا ۖ وَذَرُوا الَّذِينَ يُلْحِدُونَ فِي أَسْمَائِهِ ۚ سَيُجْزَوْنَ مَا كَانُوا يَعْمَلُونَ", "Walillahil asmaa-ul husna faad'uuhu bihaa wadzaruul-ladziina yulhiduuna fii asmaa-ihi sayujzauna maa kaanuu ya'maluun(a)", "Hanya milik Allah asmaa-ul husna, maka bermohonlah kepada-Nya dengan menyebut asmaa-ul husna itu dan tinggalkanlah orang-orang yang menyimpang dari kebenaran dalam (menyebut) nama-nama-Nya. Nanti mereka akan mendapat balasan terhadap apa yang telah mereka kerjakan."));

        return userList;
    }

    private List<User> getUserInformation() {

        List<User> userList = new ArrayList<User>();
        userList.add(new User("","الله","Allah","Allah"));
        userList.add(new User("1", "الرحمن", "Ar Rahman", "Yang Maha Pengasih"));
        userList.add(new User("2", "الرحيم", "Ar Rahiim", "Yang Maha Penyayang"));
        userList.add(new User("3", "الملك", "Al Malik", "Yang Maha Merajai / Memerintah"));
        userList.add(new User("4", "القدوس", "Al Quddus", "Yang Maha Suci"));
        userList.add(new User("5", "السلام", "As Salaam", "Yang Maha Memberi Kesejahteraan"));
        userList.add(new User("6", "المؤمن", "Al Mu`min", "Yang Maha Memberi Keamanan"));
        userList.add(new User("7", "المهيمن", "Al Muhaimin", "Yang Maha Pemelihara"));
        userList.add(new User("8", "العزيز", "Al `Aziiz", "Yang Maha PerkasaYang Maha Perkasa"));
        userList.add(new User("9", "الجبار", "Al Jabbar", "Yang Memiliki Mutlak Kegagahan"));
        userList.add(new User("10", "المتكبر", "Al Mutakabbir", "Yang Maha Megah, Yang Memiliki Kebesaran"));
        userList.add(new User("11", "الخالق", "Al Khaliq", "Yang Maha Pencipta"));
        userList.add(new User("12", "البارئ", "Al Baari`", "Yang Maha Melepaskan (Membuat, Membentuk, Menyeimbangkan)"));
        userList.add(new User("13", "المصور", "Al Mushawwir", "Yang Maha Membentuk Rupa (makhluknya)"));
        userList.add(new User("14", "الغفار", "Al Ghaffaar", "Yang Maha Pengampun"));
        userList.add(new User("15", "القهار", "Al Qahhaar", "Yang Maha Menundukan"));
        userList.add(new User("16", "الوهاب", "Al Wahhaab", "Yang Maha Pemberi Karunia"));
        userList.add(new User("17", "الرزاق", "Ar Razzaaq", "Yang Maha Pemberi Rezeki"));
        userList.add(new User("18", "الفتاح", "Al Fattaah", "Yang Maha Pembuka Rahmat"));
        userList.add(new User("19", "العليم", "Al `Aliim", "Yang Maha Mengetahui (Memiliki Ilmu)"));
        userList.add(new User("20", "القابض", "Al Qaabidh", "Yang Maha Menyempitkan (makhluknya)"));
        userList.add(new User("21", "الباسط", "Al Baasith", "Yang Maha Melapangkan (makhluknya)"));
        userList.add(new User("22", "الخافض", "Al Khaafidh", "Yang Maha Merendahkan (makhluknya)"));
        userList.add(new User("23", "الرافع", "Ar Raafi`", "Yang Maha Meninggikan (makhluknya)"));
        userList.add(new User("24", "المعز", "Al Mu`izz", "Yang Maha Memuliakan (makhluknya)"));
        userList.add(new User("25", "المذل", "Al Mudzil", "Yang Maha Menghinakan (makhluknya)"));
        userList.add(new User("26", "السميع", "Al Samii`", "Yang Maha Mendengar"));
        userList.add(new User("27", "البصير", "Al Bashiir", "Yang Maha Melihat"));
        userList.add(new User("28", "الحكم,", "Al Hakam", "Yang Maha Menetapkan"));
        userList.add(new User("29", "العدل", "Al `Adl", "Yang Maha Adil"));
        userList.add(new User("30", "اللطيف", "Al Lathiif", "Yang Maha Lembut"));
        userList.add(new User("31", "الخبير", "Al Khabiir", "Yang Maha Mengenal"));
        userList.add(new User("32", "الحليم", "Al Haliim", "Yang Maha Penyantun"));
        userList.add(new User("33", "العظيم", "Al `Azhiim", "Allah Yang Maha Agung"));
        userList.add(new User("34", "الغفور", "Al Ghafuur", "Allah Yang Maha Memberi Pengampunan"));
        userList.add(new User("35", "الشكور", "As Syakuur", "Allah Yang Maha Pembalas Budi (Menghargai)"));
        userList.add(new User("36", "العلى", "Al `Aliy", "Allah Yang Maha Tinggi"));
        userList.add(new User("37", "الكبير", "Al Kabiir", "Yang Maha Besar"));
        userList.add(new User("38", "الحفيظ", "Al Hafizh", "Allah Yang Maha Memelihara"));
        userList.add(new User("39", "المقيت", "Al Muqiit", "Allah Yang Maha Pemberi Kecukupan"));
        userList.add(new User("40", "الحسيب", "Al Hasiib", "Allah Yang Maha Membuat Perhitungan"));
        userList.add(new User("41", "الجليل", "Al Jaliil", "Allah Yang Maha Luhur"));
        userList.add(new User("42", "الكريم", "Al Kariim", "Allah Yang Maha Pemurah"));
        userList.add(new User("43", "الرقيب", "Ar Raqiib", "Allah Yang Maha Mengawasi"));
        userList.add(new User("44", "المجيب", "Al Mujiib", "Allah Yang Maha Mengabulkan"));
        userList.add(new User("45", "الواسع", "Al Waasi`", "Allah Yang Maha Luas"));
        userList.add(new User("46", "الحكيم", "Al Hakim", "Allah Yang Maha Bijaksana"));
        userList.add(new User("47", "الودود", "Al Waduud", "Allah Yang Maha Mengasihi"));
        userList.add(new User("48", "المجيد", "Al Majiid", "Allah Yang Maha Mulia"));
        userList.add(new User("49", "الباعث", "Al Baa`its", "Allah Yang Maha Membangkitkan"));
        userList.add(new User("50", "الشهيد", "As Syahiid", "Allah Yang Maha Menyaksikan"));
        userList.add(new User("51", "الحق", "Al Haqq", "Allah Yang Maha Benar"));
        userList.add(new User("52", "الوكيل", "Al Wakiil", "Allah Yang Maha Memelihara"));
        userList.add(new User("53", "القوى", "Al Qawiyyu", "Allah Yang Maha Kuat"));
        userList.add(new User("54", "المتين", "Al Matiin", "Allah Yang Maha Kokoh"));
        userList.add(new User("55", "الولى", "Al Waliyy", "Allah Yang Maha Melindungi"));
        userList.add(new User("56", "الحميد", "Al Hamiid", "Allah Yang Maha Terpuji"));
        userList.add(new User("57", "المحصى", "Al Muhshii", "Allah Yang Maha Mengalkulasi (Menghitung Segala Sesuatu)"));
        userList.add(new User("58", "المبدئ", "Al Mubdi`", "Allah Yang Maha Memulai"));
        userList.add(new User("59", "المعيد", "Al Mu`iid", "Allah Yang Maha Mengembalikan Kehidupan"));
        userList.add(new User("60", "المحيى", "Al Muhyii", "Allah Yang Maha Menghidupkan"));
        userList.add(new User("61", "المميت", "Al Mumiitu", "Allah Yang Maha Mematikan"));
        userList.add(new User("62", "الحي", "Al Hayyu", "Allah Yang Maha Hidup"));
        userList.add(new User("63", "القيوم", "Al Qayyuum", "Allah Yang Maha Mandiri"));
        userList.add(new User("64", "الواجد", "Al Waajid", "Allah Yang Maha Penemu"));
        userList.add(new User("65", "الماجد", "Al Maajid", "Allah Yang Maha Mulia"));
        userList.add(new User("66", "الواحد", "Al Wahid", "Allah Yang Maha Tunggal"));
        userList.add(new User("67", "الاحد", "Al Ahad", "Allah Yang Maha Esa"));
        userList.add(new User("68", "الصمد", "As Shamad", "Allah Yang Maha Dibutuhkan, Tempat Meminta"));
        userList.add(new User("69", "القادر", "Al Qaadir", "Allah Yang Maha Menentukan, Maha Menyeimbangkan"));
        userList.add(new User("70", "المقتدر", "Al Muqtadir", "Allah Yang Maha Berkuasa"));
        userList.add(new User("71", "المقدم", "Al Muqaddim", "Allah Yang Maha Mendahulukan"));
        userList.add(new User("72", "المؤخر", "Al Mu`akkhir", "Allah Yang Maha Mengakhirkan"));
        userList.add(new User("73", "الأول", "Al Awwal", "Allah Yang Maha Awal"));
        userList.add(new User("74", "الأخر", "Al Aakhir", "Allah Yang Maha Akhir"));
        userList.add(new User("75", "الظاهر", "Az Zhaahir", "Allah Yang Maha Nyata"));
        userList.add(new User("76", "الباطن", "Al Baathin", "Allah Yang Maha Ghaib"));
        userList.add(new User("77", "الوالي", "Al Waali", "Allah Yang Maha Memerintah"));
        userList.add(new User("78", "المتعالي", "Al Muta`aalii", "Allah Yang Maha Tinggi"));
        userList.add(new User("79", "البر", "Al Barru", "Allah Yang Maha Penderma (Maha Pemberi Kebajikan)"));
        userList.add(new User("80", "التواب", "At Tawwaab", "Allah Yang Maha Penerima Tobat"));
        userList.add(new User("81", "المنتقم", "Al Muntaqim", "Allah Yang Maha Pemberi Balasan"));
        userList.add(new User("82", "العفو", "Al Afuww", "Allah Yang Maha Pemaaf"));
        userList.add(new User("83", "الرؤوف", "Ar Ra`uuf", "Allah Yang Maha Pengasuh"));
        userList.add(new User("84", "مالك الملك", "Malikul Mulk", "Allah Yang Maha Penguasa Kerajaan (Semesta)"));
        userList.add(new User("85", "ذو الجلال و الإكرام", "Dzul Jalaali Wal Ikraam", "Allah Yang Maha Pemilik Kebesaran dan Kemuliaan"));
        userList.add(new User("86", "المقسط", "Al Muqsith", "Allah Yang Maha Pemberi Keadilan"));
        userList.add(new User("87", "الجامع", "Al Jamii`", "Allah Yang Maha Mengumpulkan"));
        userList.add(new User("88", "الغنى", "Al Ghaniyy", "Allah Yang Maha Kaya"));
        userList.add(new User("89", "المغنى", "Al Mughnii", "Allah Yang Maha Pemberi Kekayaan"));
        userList.add(new User("90", "المانع", "Al Maani", "Allah Yang Maha Mencegah"));
        userList.add(new User("91", "الضار", "Ad Dhaar", "Allah Yang Maha Penimpa Kemudharatan"));
        userList.add(new User("92", "النافع", "An Nafii`", "Allah Yang Maha Memberi Manfaat"));
        userList.add(new User("93", "النور", "An Nuur", "Allah Yang Maha Bercahaya (Menerangi, Memberi Cahaya)"));
        userList.add(new User("94", "الهادئ", "Al Haadii", "Allah Yang Maha Pemberi Petunjuk"));
        userList.add(new User("95", "البديع", "Al Badii’", "Allah Yang Maha Pencipta Yang Tiada Bandingannya"));
        userList.add(new User("96", "الباقي", "Al Baaqii", "Allah Yang Maha Kekal"));
        userList.add(new User("97", "الوارث", "Al Waarits", "Allah Yang Maha Pewaris"));
        userList.add(new User("98", "الرشيد", "Ar Rasyiid", "Allah Yang Maha Pandai"));
        userList.add(new User("99", "الصبور", "As Shabuur", "Allah Yang Maha Sabar"));

        return userList;
    }

    public class User {
        private String ayat, bacaan, arti, no;

        public String getAyat() {
            return ayat;
        }

        public String getBacaan() {
            return bacaan;
        }

        public String getArti() {
            return arti;
        }

        public String getNo() {
            return no;
        }

        public User(String no, String ayat, String bacaan, String arti) {
            this.no = no;
            this.ayat = ayat;
            this.bacaan = bacaan;
            this.arti = arti;
        }
    }

    public class User2 {
        private String bacaan, arti, bacaanlatin;


        public String getBacaan() {
            return bacaan;
        }

        public String getArti() {
            return arti;
        }

        public String getBacaanLatin() {
            return bacaanlatin;
        }


        public User2(String bacaan, String arti, String bacaanlatin) {
            this.bacaan = bacaan;
            this.arti = arti;
            this.bacaanlatin = bacaanlatin;
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    //Tombol Kembali
    public boolean onOptionsItemSelected(final MenuItem item) {

        switch (item.getItemId()) {
            case R.id.ket:
                mediaPlayer.reset();
                mediaPlayer = MediaPlayer.create(ActivityAsmaulHusna.this, R.raw.asmaul_husna);
                break;

            case R.id.suara:
                if (mediaPlayer.isPlaying()) {
                    mediaPlayer.pause();
                    item.setIcon(R.drawable.ic_play);
                } else {
                    mediaPlayer.start();
                    Toast.makeText(ActivityAsmaulHusna.this, "Suara Dari Bapak Dr. H.C Ary Ginanjar Agustian", Toast.LENGTH_SHORT).show();
                    item.setIcon(R.drawable.ic_pause);
                }
                break;

        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        // return to the App's Home Activity
        if ((keyCode == KeyEvent.KEYCODE_BACK)) {
            mediaPlayer.stop();
            mediaPlayer.reset();
            AlertDialog.Builder alBuilder = new AlertDialog.Builder(ActivityAsmaulHusna.this);
            alBuilder.setMessage("Apa kamu ingin menutup aplikasi ini ?");
            alBuilder.setPositiveButton("Iya", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    Intent keluar = new Intent(Intent.ACTION_MAIN);
                    keluar.addCategory(Intent.CATEGORY_HOME);
                    keluar.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    startActivity(keluar);
                }
            }).setNegativeButton("Tidak", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    dialog.cancel();
                }
            });

            final AlertDialog dialog;

            dialog = alBuilder.create();
            dialog.show();
            return true;
        }
        return super.onKeyDown(keyCode, event);
    }
}
