package com.azhar.asmaulhusna;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.WindowManager;
import android.widget.TextView;

import com.codesgood.views.JustifiedTextView;

public class ActivityAsmaulHusnaDetail extends AppCompatActivity {
    TextView ayat, arti;
    JustifiedTextView keterangan, meneladani;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_asmaul_husna_detail);

        getWindow().addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_NAVIGATION);

        final Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        assert getSupportActionBar() != null;
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        CollapsingToolbarLayout collapsingToolbar = (CollapsingToolbarLayout) findViewById(R.id.collab);
        collapsingToolbar.setExpandedTitleGravity(Gravity.BOTTOM);

        ayat = (TextView) findViewById(R.id.tv_ayat);
        arti = (TextView) findViewById(R.id.tv_arti);
        keterangan = (JustifiedTextView) findViewById(R.id.keterangan);
        meneladani = (JustifiedTextView) findViewById(R.id.meneladani);

        Intent mIntent = getIntent();
        int position = mIntent.getIntExtra("position", 0);
        String ayat1 = mIntent.getStringExtra("ayat");
        String bacaan = mIntent.getStringExtra("bacaan");
        String arti1 = mIntent.getStringExtra("arti");

        if (position == 0) {
            collapsingToolbar.setTitle(bacaan);

            ayat.setText(ayat1);
            arti.setText(arti1);

            keterangan.setText("Lafaz yang Maha Mulia yang merupakan nama dari Zat Ilahi yang Maha Suci serta wajib adanya yang berhak memiliki semua macam pujian dan sanjungan. Lafadz ini disebut juga lafadz Jalalah, dan juga disebut Ismu Zat. Yaitu Zat yang menciptakan langit, bumi dan seisinya termasuk kita sebagai umat manusia ini. Dan Dia lah Tuhan seluruh alam.");

            meneladani.setText("Jika dibaca 100 kali setiap hari setelah selesai shalat, jika Allah Menghendaki, maka kedengkian dan kelalaian dalam hati pembaca akan berubah.");
        } else if (position == 1) {
            collapsingToolbar.setTitle(bacaan);

            ayat.setText(ayat1);
            arti.setText(arti1);

            keterangan.setText("Maha Pengasih, yaitu pemberi kenikmatan yang agung-agung dan pengasih di dunia.");

            meneladani.setText("Jika kita membaca Yaa Rahmaan sebanyak 100x, yaitu setiap usai mengerjakan shalat fardu. Dengan seizin Allah kita akan memiliki ingatan yang kuat, pengetahuan yang cemerlang, dan terhindar dari hati yang keras.");
        } else if (position == 2) {
            collapsingToolbar.setTitle(bacaan);

            ayat.setText(ayat1);
            arti.setText(arti1);

            keterangan.setText("Maha Penyayang, yaitu pemberi kenikmatan dan penyayang.");

            meneladani.setText("Barangsiapa membaca Yaa Rahiim 100x seusai shalat subuh, dengan seizin Allah, setiap orang akan bersahabat dan baik kepadanya. Dan bila dibaca tujuh kali maka ia akan berada dalam naungan Allah. Kemudian bila setiap usai shalat fardu dibaca seratus kali maka Allah akan mengasihinya.");
        } else if (position == 3) {
            collapsingToolbar.setTitle(bacaan);

            ayat.setText(ayat1);
            arti.setText(arti1);

            keterangan.setText("Maha Merajai / Menguasai / Pemerintah, yaitu mengatur kerajaan-Nya sesuai dengan kehendak-Nya sendiri.");

            meneladani.setText("Perbanyaklah membaca Yaa Maalik. Dengan seizin Allah, kita akan diberi kekuatan, kekuasaan, kebesaran, serta kepemilikan atas segala sesuatu. Orang-orang akan memberlakukan kita dengan baik dan penuh hormat.");

        } else if (position == 4) {
            collapsingToolbar.setTitle(bacaan);

            ayat.setText(ayat1);
            arti.setText(arti1);

            keterangan.setText("Maha Suci, yaitu tersuci dan bersih dari segala cela dan kekurangan.");

            meneladani.setText("Bila Yaa Qudduus dibaca seratus kali setiap hari, dengan seizin Allah, hati orang yang membacanya akan terbebas dari rasa gundah dan gelisah. Orang yang setiap hari rutin membaca zikir ini akan mendapat kejernihan hati yang sempurna.");
        } else if (position == 5) {
            collapsingToolbar.setTitle(bacaan);

            ayat.setText(ayat1);
            arti.setText(arti1);

            keterangan.setText("Maha Penyelamat, yaitu pemberi keselamatan dan kesejahteraan kepada seluruh makhlukNya.");

            meneladani.setText("Apabila Yaa Salaam dibaca sebanyak 160 kali untuk orang yang sakit, dengan seizin Allah, orang yang sakit tersebut akan segera disembuhkan dari penyakitnya. Sering mengucapkan bacaan ini juga akan mendatangkan cinta dan keselamatan serta keamanan dari segala macam bencana.");
        } else if (position == 6) {
            collapsingToolbar.setTitle(bacaan);

            ayat.setText(ayat1);
            arti.setText(arti1);

            keterangan.setText("Maha Pengaman / Pemelihara keamanan, yaitu siapa yang bersalah dan makhlukNya itu benar-benar akan diberi siksa, sedang kepada yang taat akan benar-benar dipenuhi janji-Nya dengan pahala yang baik.");

            meneladani.setText("Barangsiapa sering membaca Yaa Mu`min, dengan seizin Allah, ia akan terbebas dari segala macam gangguan yang mungkin menghadangnya.");
        } else if (position == 7) {
            collapsingToolbar.setTitle(bacaan);

            ayat.setText(ayat1);
            arti.setText(arti1);

            keterangan.setText("Maha Pelindung / Penjaga / Maha Pengawal serta Pengawas, yaitu memerintah dan melindungi segala sesuatu.");

            meneladani.setText("Barang siapa membaca Yaa Muhaimin dalam kondisi suci (wudhunya belum batal), dengan seizin allah, batinnya bakal memancarkan cahaya. Dan barang siapa melafalkan bacaan ini 125 kali, Insya Allah, hatinya akan menjadi jernih. Ia akan menemukan rahasia dan hakikat dari setiap kejadian.");
        } else if (position == 8) {
            collapsingToolbar.setTitle(bacaan);

            ayat.setText(ayat1);
            arti.setText(arti1);

            keterangan.setText("Maha Mulia / Maha Berkuasa, yaitu kuasaNya mampu untuk berbuat sekehendakNya");

            meneladani.setText("Seseorang yang mengamalkan bacaan Yaa `Aziiz sebanyak empat puluh kali setiap usai shalat subuh selama empat puluh hari, dengan seizin Allah, dirinya tidak akan bergantung kepada orang lain. Dana barang siapa yang setiap hari setelah terbitnya fajar melafalkan bacaan ini 94 kali, maka Insya Allah, ia akan dianugerahi kewibawaan.");
        } else if (position == 9) {
            collapsingToolbar.setTitle(bacaan);

            ayat.setText(ayat1);
            arti.setText(arti1);

            keterangan.setText("Maha Perkasa / Maha Kuat / Yang Menundukkan Segalanya, yaitu mencukupi segala keperluan, melangsungkan segala perintahNya serta memperbaiki keadaan seluruh hambaNya.");

            meneladani.setText("Siapa saja yang sering membaca bacaan Yaa Jabbaar, dengan seizin Allah, ia tidak akan dipaksa oleh siapapun untuk melakukan perbuatan yang tidak ia inginkan. Ia akan terlindung dari berbagai bentuk kekerasan, kekejian, dan kekejaman.");
        } else if (position == 10) {
            collapsingToolbar.setTitle(bacaan);

            ayat.setText(ayat1);
            arti.setText(arti1);

            keterangan.setText("Maha Megah / Maha Pelengkap Kebesaran. yaitu yang melengkapi segala kebesaranNya, menyendiri dengan sifat keagungan dan kemegahanNya.");

            meneladani.setText("Orang tua yang gemar membaca Yaa Mutakabbir berulang kali, dengan seizin Allah akan diberikan kepadanya anak-anak yang saleh.");
        } else if (position == 11) {
            collapsingToolbar.setTitle(bacaan);

            ayat.setText(ayat1);
            arti.setText(arti1);

            keterangan.setText("Maha Pencipta, yaitu mengadakan seluruh makhluk tanpa asal, juga yang menakdirkan adanya semua itu.");

            meneladani.setText("Barangsiapa membaca Yaa Khaaliq berulang-ulang di malam hari, Insya Allah, Allah akan menciptakan satu malaikat yang bertugas melakukan amal kebaikan untuk orang tersebut. Di hari hisab, pahala amal kebaikan sang malaikat akan diberikan kepada orang itu. Dan siapa yang membaca Asma Allah ini sebanyak 100 kali selama 7 hari, ia akan dilindungi dari semua malapetaka, Insya Allah.");
        } else if (position == 12) {
            collapsingToolbar.setTitle(bacaan);

            ayat.setText(ayat1);
            arti.setText(arti1);

            keterangan.setText("Maha Pembuat / Maha Perancang / Maha Menjadikan, yaitu mengadakan sesuatu yang bernyawa yang ada asal mulanya.");

            meneladani.setText("Jika Seorang wanita yang mandul berpuasa selama 7 hari dan setiap hari setelah berbuka dengan air kemudian membaca Yaa Baari’uu yaa Mushawwiru sebanyak 21 kali, Allah SWT akan mengaruniakan kepadanya seorang anak lelaki, Insya Allah. Barang siapa membaca Asma Allah ini selama 7 hari berturut – turut sebanyak 100 kali maka ia akan selamat dari bencana.");
        } else if (position == 13) {
            collapsingToolbar.setTitle(bacaan);

            ayat.setText(ayat1);
            arti.setText(arti1);

            keterangan.setText("Maha Pembentuk / Maha Menjadikan Rupa Bentuk, memberikan gambaran atau bentuk pada sesuatu yang berbeza dengan lainnya. (Al-Khaaliq adalah mengadakan sesuatu yang belum ada asal mulanya atau yang menakdirkan adanya itu. Al-Baari` ialah mengeluarkannya dari yang sudah ada asalnya, manakala Al-Mushawwir ialah yang memberinya bentuk yang sesuai dengan keadaan dan keperluannya).");

            meneladani.setText("Jika seorang wanita yang tidak dapat memiliki anak dan percaya bahwa hanya Allah lah Yang Maha Pencipta, kemudian dia berpuasa selama 7 hari dan setiap berbuka puasa membaca yaa Khaaliq yaa Baarii’ yaa Mushawwir sebanyak 21 kali diatas segelas air dan berbuka puasa dengan meminum air ini, Insya Allah dia akan memiliki anak.");
        } else if (position == 14) {
            collapsingToolbar.setTitle(bacaan);

            ayat.setText(ayat1);
            arti.setText(arti1);

            keterangan.setText("Maha Pengampun, banyak pemberian maafNya dan menutupi dosa-dosa dan kesalahan.");

            meneladani.setText("Orang yang mengamalkan bacaan Yaa Ghaffaar berulang-ulang, dengan seizin Allah, dosa dan kesalahannya akan dihapuskan.");
        } else if (position == 15) {
            collapsingToolbar.setTitle(bacaan);

            ayat.setText(ayat1);
            arti.setText(arti1);

            keterangan.setText("Maha Pemaksa, menggenggam segala sesuatu dalam kekuasaanNya serta memaksa segala makhluk menurut kehendakNya.");

            meneladani.setText("Seseorang yang membaca Yaa Qohhaar berulang-ulang, dengan seizin Allah, ia akan mendapatkan beberapa kelebihan. Jiwanya mampu menaklukkan hawa nafsu, hatinya tidak cenderung pada dunia, dan batinnya akan merasa tenang. Bacaan ini juga bisa menjaga seseorang dari kezaliman orang lain.");
        } else if (position == 16) {
            collapsingToolbar.setTitle(bacaan);

            ayat.setText(ayat1);
            arti.setText(arti1);

            keterangan.setText("Maha Pemberi / Maha Menganugerah, yaitu memberi banyak kenikmatan dan selalu memberi kurnia.");

            meneladani.setText("Orang yang membaca Yaa Wahhaab tujuh kali setelah berdoa, Insya Allah doanya akan terkabul. Bila mempunyai kebutuhan atau kekurangan materi, bila membaca asma ini 100 kali setelah shalat malam dalam keadaan suci selama tiga hari atau tujuh malam, maka Allah SWT akan mencukupi seluruh kebutuhannya.");
        } else if (position == 17) {
            collapsingToolbar.setTitle(bacaan);

            ayat.setText(ayat1);
            arti.setText(arti1);

            keterangan.setText("Maha Pengrezeki / Maha Pemberi Rezeki, yaitu memberi berbagai rezeki serta membuat juga sebab-sebab diperolehnya.");

            meneladani.setText("Jika seseorang benar – benar percaya bahwa rezeki kita berasal dari Allah, dan bahwa rumah tangganya membutuhkan rezeki tersebut, maka setiap selesai melaksanakan sholat subuh dia dapat membaca yaa Razzaaq sebanyak 10 kali di keempat sudut rumahnya, dimulai dari sudut kanan dan menghadap kiblat. Allah akan menambahkan rezeki keluarganya. Membaca yaa Razzaaq sebanyak 100 kali setelah sholat jumat akan membantu orang yang mengalami stres dan depresi.");
        } else if (position == 18) {
            collapsingToolbar.setTitle(bacaan);

            ayat.setText(ayat1);
            arti.setText(arti1);

            keterangan.setText("Maha Membukakan / Maha Pembuka, yaitu membuka gedung penyimpanan rahmatNya untuk seluruh hambaNya.");

            meneladani.setText("Barangsiapa ingin hatinya dibuka dan memperoleh kemenangan, perbanyaklah melafalkan Yaa Fattaah. Usai shalat subuh bacalah lafal ini tujuh puluh kali kemudian letakkan tangan di atas dada. Maka kegelapan yang ada di hati akan sirna. Bila dibaca rutin, lafal ini akan bermanfaat untuk memudahkan semua pekerjaan.");
        } else if (position == 19) {
            collapsingToolbar.setTitle(bacaan);

            ayat.setText(ayat1);
            arti.setText(arti1);

            keterangan.setText("Maha Mengetahui, yaitu mengetahui segala yang maujud dan tidak ada satu benda pun yang tertutup oleh penglihatanNya.");

            meneladani.setText("Barangsiapa sering membaca Yaa `Aliim, hatinya akan cemerlang dan mampu menyingkapkan cahaya Ilahi. Bacaan ini memiliki manfaat yang besar guna mendapatkan ilmu dan menampakkan hal-hal yang tersembunyi. Melafalkan bacaan ini sepuluh kali setiap selesai shalat, Insya Allah, akan membuka hal-hal yang ghaib. Jika seseorang melazinkan membaca Asma Allah ini sebanyak 150 kali setiap hari, niscaya pemikiran dan pemahamannya akan bertambah. Barang siapa membaca Asma Allah ini sebanyak 100 kali secara rutin setiap selesai sholat fardhu, maka ia akan memperoleh kemampuan untuk melihat hal – hal tertentu yang luput dari perhatian orang dan memiliki iman yang kuat. Di samping itu, hatinya akan dipenuhi dengan ma’rifatullahi (mengenal Allah).");
        } else if (position == 20) {
            collapsingToolbar.setTitle(bacaan);

            ayat.setText(ayat1);
            arti.setText(arti1);

            keterangan.setText("Maha Pencabut / Maha Penyempit Hidup / Maha Pengekang, yaitu mengambil nyawa atau menyempitkan rezeki bagi siapa yang dikehendaki olehNya.");

            meneladani.setText("Barangsiapa menuliskan Yaa Qaabidh di atas lima puluh makanan (buah, roti, dan sebagainya) selama empat puluh hari. Dengan seizin Allah, ia tidak akan kelaparan. Bahkan ia akan mendapatkan limpahan rezeki. ");
        } else if (position == 21) {
            collapsingToolbar.setTitle(bacaan);

            ayat.setText(ayat1);
            arti.setText(arti1);

            keterangan.setText("Maha Meluaskan / Maha Pelapang Hidup / Maha Melimpah Nikmat, yaitu memudahkan terkumpulnya rezeki bagi siapa yang diinginkan olehNya.");

            meneladani.setText("Barangsiapa membaca Yaa Baasith sepuluh kali di waktu fajar, setelah shalat subuh, dengan tangan terbuka (telapak tangan menghadap ke atas) lalu mengusap wajahnya dengan tangan. Maka, dengan seizin Allah, ia tidak akan bergantung kepada orang lain serta akan memperoleh kekayaan. ");
        } else if (position == 22) {
            collapsingToolbar.setTitle(bacaan);

            ayat.setText(ayat1);
            arti.setText(arti1);

            keterangan.setText("Maha Menjatuhkan / Maha Menghinakan / Maha Perendah / Pengurang, yaitu terhadap orang yang selayaknya dijatuhkan akibat kelakuannya sendiri dengan memberinya kehinaan, kerendahan dan seksaan.");

            meneladani.setText("Barangsiapa ingin terbebas dari kejahatan musuh, berpuasalah selama tiga hari. Kemudian pada hari keempatnya membaca Yaa Khaafidh sebanyak 70 ribu kali. Orang yang mengamalkan asma ini sebanyak tujuh puluh kali, Allah SWT akan menjaganya dari kejahatan orang-orang yang zalim. ");
        } else if (position == 23) {
            collapsingToolbar.setTitle(bacaan);

            ayat.setText(ayat1);
            arti.setText(arti1);

            keterangan.setText("Maha Mengangkat / Maha Peninggi, yaitu terhadap orang yang selayaknya diangkat kedudukannya kerana usahanya yang giat, yaitu termasuk golongan kaum yang bertaqwa.");

            meneladani.setText("Barangsiapa mengamalkan bacaan Yaa Raafi` seratus kali setiap hari, siang atau malam, maka Allah akan memuliakan orang tersebut serta memberinya kekayaan dan kebaikan.");
        } else if (position == 24) {
            collapsingToolbar.setTitle(bacaan);

            ayat.setText(ayat1);
            arti.setText(arti1);

            keterangan.setText("Maha Menghormati / Memuliakan / Maha Pemberi Kemuliaan/Kemenangan, yaitu kepada orang yang berpegang teguh pada agamaNya dengan memberinya pentolongan dan kemenangan.");

            meneladani.setText("Jika Yaa Mu`izz dibaca 140 kali setelah shalat Isya, yaitu pada malam senin dan jum`at, maka Allah akan membuat hamba yang membacanya menjadi mulia dan terhormat di mata orang lain. Orang tersebut tidak akan memiliki rasa takut kepada siapapun, selain kepada Allah SWT. ");
        } else if (position == 25) {
            collapsingToolbar.setTitle(bacaan);

            ayat.setText(ayat1);
            arti.setText(arti1);

            keterangan.setText("Maha Menghina / Pemberi kehinaan, yaitu kepada musuh-musuhNya dan musuh ummat Islam seluruhnya.");

            meneladani.setText("Barangsiapa mengamalkan Yaa Mudzill sebanyak 75 kali, Insya Allah, dirinya akan terbebas dari gangguan orang-orang yang iri padanya, serta dari orang yang berniat untuk mencelakainya. Ia akan selalu dilindungi oleh Allah SWT. ");
        } else if (position == 26) {
            collapsingToolbar.setTitle(bacaan);

            ayat.setText(ayat1);
            arti.setText(arti1);

            keterangan.setText("Maha Mendengar.");

            meneladani.setText("Barangsiapa membaca Yaa Samii` pada hari kamis, yaitu setelah shalat Zuhur sebanayak 100 kali, tanpa berbicara dengan siapapun, dengan seizin Allah, keinginannya akan dikabulkan Allah.");
        } else if (position == 27) {
            collapsingToolbar.setTitle(bacaan);

            ayat.setText(ayat1);
            arti.setText(arti1);

            keterangan.setText("Allah itu Al-Bashir, artinya adalah Allah itu Maha Melihat segala sesuatu. Kita sebagai manusia hanya memiliki penglihatan yang terbatas.\nOrang yang membaca Yaa Bashiir sebanyak 100 kali setelah sholat jumat secara istiqamah, Allah WT akan mengaruniakan kepadanya penglihatan (mata) yang tajam dan cahaya dalam hatinya. Insya Allah. Jika suatu pekerjaan tidak diniatkan untuk diri sendiri melainkan karena Allah, kemudian orang tersebut membaca yaa Allaah yaa Bashiir sebanyak 100 kali sebelum sholat jumat, niscaya Allah akan menggembirakan orang itu dengan kasih sayang-Nya dan memberikannya keberhasilan dalam pekerjaan yang diniatkannya itu.");

            meneladani.setText("Barangsiapa mengamalkan Yaa Bashiir sebanyak 100 kali, yaitu antara shalat jum`at dan shalat sunah setelahnya, maka Allah akan meninggikan kedudukannya di mata orang lain.");
        } else if (position == 28) {
            collapsingToolbar.setTitle(bacaan);

            ayat.setText(ayat1);
            arti.setText(arti1);

            keterangan.setText("Maha Menghukum / Maha Mengadili, yaitu sebagai hakim yang menetapkan / memutuskan yang tidak seorang pun dapat menolak keputusanNya, juga tidak seorang pun yang berkuasa merintangi kelangsungan hukumNya itu.");

            meneladani.setText("Barangsiapa membaca Yaa Hakam berulang kali pada malam hari, maka dengan izin-Nya, rahasia (hal-hal yang tersembunyi) akan dinampakkan padanya.");
        } else if (position == 29) {
            collapsingToolbar.setTitle(bacaan);

            ayat.setText(ayat1);
            arti.setText(arti1);

            keterangan.setText("Maha Adil. Serta sangat sempurna dalam keadilanNya itu.");

            meneladani.setText("Bila seseorang menuliskan bacaan Yaa`Adl di atas sekerat roti pada malam jum`at lalu memakan roti itu, maka dengan izin Allah, orang lain akan menuruti ucapannya.");
        } else if (position == 30) {
            collapsingToolbar.setTitle(bacaan);

            ayat.setText(ayat1);
            arti.setText(arti1);

            keterangan.setText("Maha Menghalusi / Maha Teliti / Maha Lembut serta Halus, yaitu mengetahui segala sesuatu yang samar-samar, pelik-pelik dan kecil-kecil.");

            meneladani.setText("Bacaan Yaa Lathiif memiliki beberapa faedah. Yaitu bisa mendekatkan kita pada hasil, menghilangkan semua rasa sakit, penyakit, dan semua kesulitan. Di saat ada bencana, kesusahan, dan kesedihan, melafalkannya dapat mendatangkan keselamatan, kebahagiaan, keamanan, dan keyakinan.");
        } else if (position == 31) {
            collapsingToolbar.setTitle(bacaan);

            ayat.setText(ayat1);
            arti.setText(arti1);

            keterangan.setText("Maha Waspada / Maha Mengetahui.");

            meneladani.setText("Seseorang yang memiliki kebiasaan buruk lalu ia membaca Yaa Khobiir berkali-kali, maka dengan seizin Allah, kebiasaan buruknya itu akan segera menghilang dari dirinya.");
        } else if (position == 32) {
            collapsingToolbar.setTitle(bacaan);

            ayat.setText(ayat1);
            arti.setText(arti1);

            keterangan.setText("Maha Penyabar / Maha Penyantun / Maha Penghamba, yaitu yang tidak tergesa-gesa melakukan kemarahan dan tidak pula gelojoh memberikan siksaan.");

            meneladani.setText("Dianjurkan untuk rutin membaca Yaa Haliim 100 kali dalam sehari untuk meredakan kemarahan dan mengetahui hal-hal yang ghaib, untuk memadamkan api kemarahan dan kebodohan, serta untuk mendapatkan ketenangan hati dan terjaga dari berbagai bencana.");
        } else if (position == 33) {
            collapsingToolbar.setTitle(bacaan);

            ayat.setText(ayat1);
            arti.setText(arti1);

            keterangan.setText("Maha Agung, yaitu mencapai puncak tertinggi dan di mercu keagungan kerana bersifat dengan segala macam sifat kebesaran dan kesempunnaan.");

            meneladani.setText("Orang yang sering mengamalkan bacaan Yaa `Azhiim, dengan seizin Allah, akan dihormati oleh orang lain.");
        } else if (position == 34) {
            collapsingToolbar.setTitle(bacaan);

            ayat.setText(ayat1);
            arti.setText(arti1);

            keterangan.setText("Maha Pengampun, banyak pengampunanNya kepada hamba-hambaNya.");

            meneladani.setText("Orang yang terserang sakit kepala dan demam lalu ia membaca Yaa Ghofuur, maka dengan siizin Allah, ia akan sembuh dari penyakit yang dideritanya itu. Banyak mengulang-ulang asma ini juga dapat menghilangkan penyakit was-was.");
        } else if (position == 35) {
            collapsingToolbar.setTitle(bacaan);

            ayat.setText(ayat1);
            arti.setText(arti1);

            keterangan.setText("Maha Pembalas / Maha Bersyukur, yaitu memberikan balasan yang banyak sekali atas amalan yang kecil.");

            meneladani.setText("Barangsiapa yang bersedih lalu ia membaca Yaa Syaakuur sebanyak 41 kali kemudian meniupkannya ke dalam segelas air dan membasuh wajahnya dengan air tersebut. Maka dengan siizin Allah, hatinya akan menjadi tentram dan tenang. Dan ia akan dapat mencukupi kebutuhannya.");
        } else if (position == 36) {
            collapsingToolbar.setTitle(bacaan);

            ayat.setText(ayat1);
            arti.setText(arti1);

            keterangan.setText("Maha Tinggi Martabat-Nya / Maha Tinggi serta Mulia, yaitu mencapai tingkat yang setinggi-tingginya yang tidak mungkin digambarkan oleh akal fikiran sesiapa pun dan tidak dapat difahami oleh otak yang bagaimanapun pandainya.");

            meneladani.setText("Barangsiapa kadar imannya sedang turun lalu ia membaca Yaa `Aliyy berkali-kali, maka dengan siizin Allah, imannya akan kembali meningkat serta peruntungannya terbuka. Dan bagi seseorang yang tengah dalam perjalanan pulang, dengan seizin Allah, ia akan sampai ke kampung halamannya dengan selamat.");
        } else if (position == 37) {
            collapsingToolbar.setTitle(bacaan);

            ayat.setText(ayat1);
            arti.setText(arti1);

            keterangan.setText("Maha Besar, yang kebesaranNya tidak dapat dicapai oleh pancaindera ataupun akal manusia.");

            meneladani.setText("Barangsiapa ingin mendapatkan penghormatan maka bacalah Yaa Kabiir seratus kali setiap hari.");
        } else if (position == 38) {
            collapsingToolbar.setTitle(bacaan);

            ayat.setText(ayat1);
            arti.setText(arti1);

            keterangan.setText("Maha Pemelihara Maha Pelindung / Maha Memelihara, yaitu menjaga segala sesuatu jangan sampai rosak dan goyah. Juga menjaga segala amal perbuatan hamba-hambaNya, sehingga tidak akan disia-siakan sedikit pun untuk memberikan balasanNya.");

            meneladani.setText("Orang yang membaca Yaa Haafiizh enam belas kali setiap hari, dengan siizin Allah, ia akan terlindung dari berbagai musibah. Jika dibaca 998 kali, ia akan terlindung dari segala macam ketakutan meski ia pergi ke tempat berbahaya. Ia juga terjaga dari bahaya tenggelam. Ucapannya akan selalu terjaga dan doanya akan cepat terjawab.");
        } else if (position == 39) {
            collapsingToolbar.setTitle(bacaan);

            ayat.setText(ayat1);
            arti.setText(arti1);

            keterangan.setText("Maha Pemberi Kecukupan / Maha Pemberi Keperluan, baik yang berupa makanan tubuh ataupun makanan rohani.");

            meneladani.setText("Apabila seseorang mempunyai anak dengan perangai buruk, hendaknya ia membaca Yaa Muqiit berulang-ulang lalu ditiupkan ke dalam segelas air dan meminumkannya kepada anak tersebut. Maka dengan seizin allah, anak tersebut akan berperangai baik.");
        } else if (position == 40) {
            collapsingToolbar.setTitle(bacaan);

            ayat.setText(ayat1);
            arti.setText(arti1);

            keterangan.setText("Maha Penjamin / Maha Mencukupi / Maha Penghitung, yaitu memberikan jaminan kecukupan kepada seluruh bamba-hambaNya pada hari Kiamat.");

            meneladani.setText("Jika seseorang takut dirampok, didengki, diganggu, atau dizalimi oleh orang lain, hendaknya mulai hari kamis ia membaca Yaa Hasiib sebanyak 70 kali siang dan malam selama tujuh hari. Dan pada hitungan ke-71 ia mengucapkan Hasbiyallaahul-Hasiib. Insya Allah, rasa takut yang ada di dalam dirinya itu akan lenyap.");
        } else if (position == 41) {
            collapsingToolbar.setTitle(bacaan);

            ayat.setText(ayat1);
            arti.setText(arti1);

            keterangan.setText("Maha Luhur, yaitu yang memiliki sifat-sifat keluhuran kerana kesempurnaan sifat-sifatNya.");

            meneladani.setText("Perbanyaklah membaca Yaa Jaliil untuk menambah amalan pahala kebaikan.");
        } else if (position == 42) {
            collapsingToolbar.setTitle(bacaan);

            ayat.setText(ayat1);
            arti.setText(arti1);

            keterangan.setText("Maha Pemurah, yaitu mulia tanpa had dan memberi siapa pun tanpa diminta atau sebagai penggantian dan sesuatu pemberian.");

            meneladani.setText("Orang yang mengamalkan bacaan Yaa Kariim, dengan seizin Allah, ia akan mendapatkan kemuliaan baik di dunia maupun di akhirat kelak.");
        } else if (position == 43) {
            collapsingToolbar.setTitle(bacaan);

            ayat.setText(ayat1);
            arti.setText(arti1);

            keterangan.setText("Maha Peneliti / Maha Pengawas Maha Waspada, yaitu yang mengamat-amati gerak-geri segala sesuatu dan mengawasinya.");

            meneladani.setText("Barangsiapa membaca Yaa Raqiib sebanyak tujuh kali untuk dirinya sendiri, keluarga, dan kekayaannya, dengan seizin Allah, semuanya itu akan berada di bawah perlindungan Allah. Jika bacaan ini senantiasa diamalkan maka kelalaian akan sirna dari hati.");
        } else if (position == 44) {
            collapsingToolbar.setTitle(bacaan);

            ayat.setText(ayat1);
            arti.setText(arti1);

            keterangan.setText("Maha Mengabulkan, yaitu yang memenuhi permohonan siapa saja yang berdoa padaNya.");

            meneladani.setText("Permohonan seorang hamba yang disertai dengan penyebutan Yaa Mujiib, Insya Allah, akan dikabulkan oleh Allah.");
        } else if (position == 45) {
            collapsingToolbar.setTitle(bacaan);

            ayat.setText(ayat1);
            arti.setText(arti1);

            keterangan.setText("Maha Luas Pemberian-Nya , yaitu kerahmatanNya merata kepada segala yang maujud dan luas pula ilmuNya terhadap segala sesuatu.");

            meneladani.setText("Barangsiapa sulit mendapatkan nafkah lalu membaca Yaa Waasi`, dengan seizin Allah, ia akan mendapatkan sumber nafkah yang layak.");
        } else if (position == 46) {
            collapsingToolbar.setTitle(bacaan);

            ayat.setText(ayat1);
            arti.setText(arti1);

            keterangan.setText("Maha Bijaksana, yaitu memiliki kebijaksanaan yang tertinggi kesempurnaan ilmuNya serta kerapiannya dalam membuat segala sesuatu.");

            meneladani.setText("Seseorang yang rajin membaca Yaa Hakiim dari waktu ke waktu, dengan seizin Allah, ia tidak akan mendapatkan kesulitan dalam pekerjaannya.");
        } else if (position == 47) {
            collapsingToolbar.setTitle(bacaan);

            ayat.setText(ayat1);
            arti.setText(arti1);

            keterangan.setText("Maha Pencinta / Maha Menyayangi, yaitu yang menginginkan segala kebaikan untuk seluruh hambaNya dan juga berbuat baik pada mereka itu dalam segala hal dan keadaan.");

            meneladani.setText("Bila terjadi persengketaan di antara dua orang, kemudian salah satunya membaca Yaa Waduud seribu kali pada makanan atau minuman lalu meminta orang yang bersengketa dengannya mengkonsumsi makanan atau minuman tersebut, dengan seizin Allah, persengketaan mereka berdua akan selesai.");
        } else if (position == 48) {
            collapsingToolbar.setTitle(bacaan);

            ayat.setText(ayat1);
            arti.setText(arti1);

            keterangan.setText("Maha Mulia, yaitu yang mencapai tingkat teratas dalam hal kemuliaan dan keutamaan.");

            meneladani.setText("Orang yang sering membaca Yaa Majiid, dengan seizin allah, ia akan dianugerahi kemuliaan oleh Allah SWT.");
        } else if (position == 49) {
            collapsingToolbar.setTitle(bacaan);

            ayat.setText(ayat1);
            arti.setText(arti1);

            keterangan.setText("Maha Membangkitkan, yaitu membangkitkan semangat dan kemahuan, juga membangkitkan para Rasul dan orang-orang yang telah mati dari kubur masing-masing nanti setelah tibanya hari Qiamat.");

            meneladani.setText("Membaca Yaa Baa`its berulang-ulang akan mendatangkan rasa takut kita kepada Allah SWT. Seseorang yang sebelum tidur mengusapkan tangannya ke dada dan melafalkan bacaan ini seratus kali, Allah SWT akan menghidupkan hatinya dengan cahaya makrifat-Nya.");
        } else if (position == 50) {
            collapsingToolbar.setTitle(bacaan);

            ayat.setText(ayat1);
            arti.setText(arti1);

            keterangan.setText("Maha Menyaksikan / Maha Mengetahui keadaan semua makhluk.");

            meneladani.setText("Orangtua yang mempunyai anak yang nakal dianjurkan untuk membaca Yaa Syahiid berulang-ulang untuk anaknya tersebut. Insya Allah, Allah akan memberikan kesalihan kepada anak itu.");
        } else if (position == 51) {
            collapsingToolbar.setTitle(bacaan);

            ayat.setText(ayat1);
            arti.setText(arti1);

            keterangan.setText("Maha Haq / Maha Benar yang kekal dan tidak akan berubah sedikit pun.");

            meneladani.setText("Apabila seseorang kehilangan sesuatu lalu membaca Yaa Haqq berulang-ulang, dengan seizin Allah, ia akan menemukan sesuatu yang hilang tersebut.");
        } else if (position == 52) {
            collapsingToolbar.setTitle(bacaan);

            ayat.setText(ayat1);
            arti.setText(arti1);

            keterangan.setText("Maha Pentadbir / Maha Berserah / Maha Memelihara penyerahan, yakni memelihara semua urusan hamba-hambaNya dan apa-apa yang menjadi keperluan mereka itu.");

            meneladani.setText("Orang yang takut tenggelam, terbakar api, atau bahaya lain yang sejenis, hendaknya sering mengulang-ulang membaca Yaa Wakiil. Dengan seizin Allah, ia akan selalu berada dalam lindungan Allah SWT. Bacaan ini juga memiliki pengaruh yang luar biasa untuk mendekatkan kita pada apa yang diinginkan dan juga untuk memenuhi kebutuhan kita. ");
        } else if (position == 53) {
            collapsingToolbar.setTitle(bacaan);

            ayat.setText(ayat1);
            arti.setText(arti1);

            keterangan.setText("Maha Kuat / Maha Memiliki Kekuatan , yaitu yang memiliki kekuasaan yang sesempurnanya.");

            meneladani.setText("Seseorang yang tidak mampu mengalahkan musuhnya lalu mengucapkan Yaa Qowiyy dengan tujuan agar tidak dizalimi, dengan seizin Allah, ia akan terbebas dari gangguan musuhnya itu.");
        } else if (position == 54) {
            collapsingToolbar.setTitle(bacaan);

            ayat.setText(ayat1);
            arti.setText(arti1);

            keterangan.setText("Maha Teguh / Maha Kukuh atau Perkasa / Maha Sempurna Kekuatan-Nya , yaitu memiliki keperkasaan yang sudah sampai di puncaknya.");

            meneladani.setText("Barangsiapa yang sedang tertimpa suatu kesulitan lalu melafalkan Yaa Matiin berulang-ulang, dengan seizin Allah, kesulitannya akan sirna. ");
        } else if (position == 55) {
            collapsingToolbar.setTitle(bacaan);

            ayat.setText(ayat1);
            arti.setText(arti1);

            keterangan.setText("Maha Melindungi, yaitu melindungi serta mengaturkan semua kepentingan makhlukNya kerana kecintaanNya yang amat sangat dan pemberian pertolonganNya yang tidak terbatas pada keperluan mereka.");

            meneladani.setText("Barangsiapa sering mengamalkan Yaa Waliyy, dengan seizin Allah, ia akan menjadi kekasih atau wali Allah. ");
        } else if (position == 56) {
            collapsingToolbar.setTitle(bacaan);

            ayat.setText(ayat1);
            arti.setText(arti1);

            keterangan.setText("Maha Terpuji, yang memang sudah selayaknya untuk memperoleh pujian dan sanjungan.");

            meneladani.setText("Orang yang sering mengucapkan Yaa Hamiid, dengan seizin Allah, ia akan dicintai dan dihormati oleh orang lain.");
        } else if (position == 57) {
            collapsingToolbar.setTitle(bacaan);

            ayat.setText(ayat1);
            arti.setText(arti1);

            keterangan.setText("Maha Menghitung / Maha Penghitung, yaitu yang tiada satu pun tertutup dari pandanganNya dan semua amalan diperhitungkan sebagaimana wajarnya.");

            meneladani.setText("Bila seseorang takut tidak bisa menjawab pertanyaan pada hari pengadilan di akhirat kelak, hendaknya ia sering membaca Yaa Muhshii sebanyak seribu kali. Insya Allah, ia akan mendapat kemudahan.");
        } else if (position == 58) {
            collapsingToolbar.setTitle(bacaan);

            ayat.setText(ayat1);
            arti.setText(arti1);

            keterangan.setText("Maha Memulai/Pemula / Maha Pencipta dari Asal, yaitu yang melahirkan sesuatu yang asalnya tidak ada dan belum maujud.");

            meneladani.setText("Sekiranya Yaa Mubdi` dibaca berulang-ulang lalu ditiupkan kepada wanita yang hamil yang takut keguguran, Insya Allah, ia tidak akan mengalami musibah itu.");
        } else if (position == 59) {
            collapsingToolbar.setTitle(bacaan);

            ayat.setText(ayat1);
            arti.setText(arti1);

            keterangan.setText("Maha Mengulangi / Maha Mengembalikan dan Memulihkan, yaitu menumbuhkan kembali setelah lenyapnya atau setelah rosaknya.");

            meneladani.setText("Jika Yaa Mu`iid dibaca sebanyak tujuh puluh kali dan ditujukan kepada seeorang yang jauh dari keluarganya, dengan seizin Allah, orang tersebut akan pulang dengan selamat. ");
        } else if (position == 60) {
            collapsingToolbar.setTitle(bacaan);

            ayat.setText(ayat1);
            arti.setText(arti1);

            keterangan.setText("Maha Menghidupkan, yaitu memberikan daya kehidupan pada setiap sesuatu yang berhak hidup.");

            meneladani.setText("Bila seseorang sedang memikul beban persoalan yang berat lalu ia mengucakan Yaa Muhyii tujuh kali setiap hari, Insya Allah, beban tersebut akan terlepas darinya. ");
        } else if (position == 61) {
            collapsingToolbar.setTitle(bacaan);

            ayat.setText(ayat1);
            arti.setText(arti1);

            keterangan.setText("Maha Mematikan, yaitu mengambil kehidupan (roh) dari apa-apa yang hidup.");

            meneladani.setText("Bacaan Yaa Mumiit memiliki manfaat besar untuk menghancurkan dan mematahkan kekuatan musuh.");
        } else if (position == 62) {
            collapsingToolbar.setTitle(bacaan);

            ayat.setText(ayat1);
            arti.setText(arti1);

            keterangan.setText("Maha Hidup, yaitu sentiasa kekal hidupNya itu.");

            meneladani.setText("Bacaan Yaa Hayy berkhasiat memanjangkan umur. Baragsiapa yang rutin membacanya, khususnya setiap setelah selesai shalat sebanyak 18 kali, Insya Allah, ia akan terhindar dari kematian mendadak dan rejekinya diluaskan. Untuk mengobati sakit mata, bacalah Yaa Hayy sembilan belas kali. Insya Allah akan sembuh.");
        } else if (position == 63) {
            collapsingToolbar.setTitle(bacaan);

            ayat.setText(ayat1);
            arti.setText(arti1);

            keterangan.setText("Maha Berdiri Dengan Sendiri-Nya , yaitu baik ZatNya, SifatNya, Af`alNya. Juga membuat berdirinya apa-apa yang selain Dia. DenganNya pula berdirinya langit dan bumi ini.");

            meneladani.setText("");
        } else if (position == 64) {
            collapsingToolbar.setTitle(bacaan);

            ayat.setText(ayat1);
            arti.setText(arti1);

            keterangan.setText("Maha Penemu / Maha Menemukan, yaitu dapat menemukan apa saja yang diinginkan olehNya, maka tidak berkehendakkan pada suatu apa pun kerana sifat kayaNya yang secara mutlak.");

            meneladani.setText("Seseorang yang ingin jadi pemurah hendaknya memperbanyak mambaca Yaa Waajid.");
        } else if (position == 65) {
            collapsingToolbar.setTitle(bacaan);

            ayat.setText(ayat1);
            arti.setText(arti1);

            keterangan.setText("Maha Mulia, (sama dengan no. 48 yang berbeda hanyalah tulisannya dalam bahasa Arab, Ejaan sebenarnya no. 48 Al-Majiid, sedang no. 65 A1-Maajid).");

            meneladani.setText("Orang yang sering mengamalkan Yaa Maajid, dengan seizin Allah, hatinya akan tercerahkan. ");
        } else if (position == 66) {
            collapsingToolbar.setTitle(bacaan);

            ayat.setText(ayat1);
            arti.setText(arti1);

            keterangan.setText("Maha Esa.");

            meneladani.setText("Orang yang membaca Yaa Waahid berulang-ulang dalam kondisi yang menyendiri dan di tempat yang tenang, dengan seizin Allah dia akan terlepas dari rasa takut dan angan-angan. Bacaan ini juga berpengaruh besar dalam mendatangkan kasih sayang. Juga kedekatan serta kemuliaan di antara keluarga dan sanak keluarga dan sanak saudara. ");
        } else if (position == 67) {
            collapsingToolbar.setTitle(bacaan);

            ayat.setText(ayat1);
            arti.setText(arti1);

            keterangan.setText("Maha Tunggal.");

            meneladani.setText("Orang yang membaca Yaa Ahad seribu kali, dengan seizin Allah, sejumlah rahasia tertentu akan disingkap baginya. Barangsiapa yang tengah sendiri setelah menahan nafsu atau memperbanyak ibadah kemudian mengucapkan Yaa Ahad seribu kali, Insya Allah, ia akan menyaksikan malaikat di sekitarnya.");
        } else if (position == 68) {
            collapsingToolbar.setTitle(bacaan);

            ayat.setText(ayat1);
            arti.setText(arti1);

            keterangan.setText("Maha Diperlukan / Maha Diminta / Yang Menjadi Tumpuan, yaitu selalu menjadi tujuan dan harapan orang di waktu ada hajat keperluan.");

            meneladani.setText("Barangsiapa rajin membaca Yaa Shomad berulang-ulang, Insya Allah, Allah akan memenuhi kebutuhannya.");
        } else if (position == 69) {
            collapsingToolbar.setTitle(bacaan);

            ayat.setText(ayat1);
            arti.setText(arti1);

            keterangan.setText("Maha Berkuasa / Maha Kuasa / Maha Berupaya.");

            meneladani.setText("Barangsiapa sering mengamalkan Yaa Qoodir, dengan seizin Allah, semua hasrat dan keinginannya akan terkabul.");
        } else if (position == 70) {
            collapsingToolbar.setTitle(bacaan);

            ayat.setText(ayat1);
            arti.setText(arti1);

            keterangan.setText("Maha Menentukan, Maha Menyeimbangkan.");

            meneladani.setText("Orang yang membaca Yaa Muqtadir terus menerus, dengan seizin Allah, ia akan memiliki pengetahuan tentang kebenaran.");
        } else if (position == 71) {
            collapsingToolbar.setTitle(bacaan);

            ayat.setText(ayat1);
            arti.setText(arti1);

            keterangan.setText("Maha Mendahulukan / Maha Menyegera, yaitu mendahulukan sebahagian benda dari yang lainnya dalam mewujudnya, atau dalam kemuliaannya, selisih waktu atau tempatnya.");

            meneladani.setText("Seseorang yang membaca Yaa Muqoddim berkali-kali di medan peperangan atau di suatu tempat yang menakutkan, Insya Allah, ia tidak akan terkena gangguan. ");
        } else if (position == 72) {
            collapsingToolbar.setTitle(bacaan);

            ayat.setText(ayat1);
            arti.setText(arti1);

            keterangan.setText("Maha Menangguhkan / Maha Mengakhirkan / Maha Membelakangkan / Maha Melambat-lambatkan. Yaitu melewatkan sebahagian sesuatu dari yang lainnya.");

            meneladani.setText("Barangsiapa membaca Yaa Muakhkhir di dalam hati sebanyak seratus kali setiap hari, Insya Allah, relung hatinya akan dipenuhi dengan kecintaan kepada Allah. Tidak ada kecintaan kepada selain-Nya.");
        } else if (position == 73) {
            collapsingToolbar.setTitle(bacaan);

            ayat.setText(ayat1);
            arti.setText(arti1);

            keterangan.setText("Maha Pemulaan / Maha Pertama, yaitu terdahulu sekali dari semua yang maujud.");

            meneladani.setText("Barangsiapa ingin dikaruniaiseorang anak, atau ingin bertemu dengan seseorang yang sedang berpergian jauh maka bacalah Yaa Awwal sebanyak seribu kali selama empat puluh jum`at.");
        } else if (position == 74) {
            collapsingToolbar.setTitle(bacaan);

            ayat.setText(ayat1);
            arti.setText(arti1);

            keterangan.setText("Maha Penghabisan / Yang Akhir, yaitu kekal terus setelah habisnya segala sesuatu yang maujud");

            meneladani.setText("Seseorang yang sering membaca Yaa Aakhir akan menjalani hidup dengan baik. Dan di akhir hayatnya, Insya Allah, ia akan menutup usianya dengan baik. ");
        } else if (position == 75) {
            collapsingToolbar.setTitle(bacaan);

            ayat.setText(ayat1);
            arti.setText(arti1);

            keterangan.setText("Maha Zahir / Maha Nyata / Maha Menyatakan, yaitu menyatakan dan menampakkan kewujudanNya itu dengan bukti-bukti dan tanda-tanda ciptaanNya.");

            meneladani.setText("Barangsiapa membaca Yaa Zhaahir sebanyak lima belas kali setelah shalat jum`at, dengan seizin Allah, cahaya Ilahi akan masuk ke hatinya.");
        } else if (position == 76) {
            collapsingToolbar.setTitle(bacaan);

            ayat.setText(ayat1);
            arti.setText(arti1);

            keterangan.setText("Maha Tersembunyi, yaitu tidak dapat dimaklumi ZatNya, sehingga tidak seorang pun dapat mengenal ZatNya itu.");

            meneladani.setText("Barangsiapa ingin melihat kebenaran dalam berbagai hal, bacalah Yaa Baathin tiga kali setiap hari. ");
        } else if (position == 77) {
            collapsingToolbar.setTitle(bacaan);

            ayat.setText(ayat1);
            arti.setText(arti1);

            keterangan.setText("Maha Menguasai / Maha Menguasai Urusan / Yang Maha Memerintah, yaitu menggenggam segala sesuatu dalam kekuasaanNya dan menjadi milikNya.");

            meneladani.setText("Bila seseorang membaca Yaa Waalii berulang-ulang lalu meniupkannya ke dalam rumahnya, maka dengan seizin Allah, Allah akan melindungi rumah tersebut dari bahaya.");
        } else if (position == 78) {
            collapsingToolbar.setTitle(bacaan);

            ayat.setText(ayat1);
            arti.setText(arti1);

            keterangan.setText("Maha Suci/Tinggi, yaitu terpelihara dari segala kekurangan dan kerendahan.");

            meneladani.setText("Bila seseorang rajin membaca Yaa Muta`aalii berulang-ulang, dengan seizin Allah, Allah akan memberinya banyak kebaikan.");
        } else if (position == 79) {
            collapsingToolbar.setTitle(bacaan);

            ayat.setText(ayat1);
            arti.setText(arti1);

            keterangan.setText("Maha Dermawan / Maha Bagus (Sumber Segala Kelebihan) / Yang banyak membuat kebajikan, yaitu banyak kebaikanNya dan besar kenikmatan yang dilimpahkanNya.");

            meneladani.setText("Bila seseorang rajin membaca Yaa Barr untuk anaknya, dengan seizin Allah, anaknya akan terlepas dari berbagai kemalangan.");
        } else if (position == 80) {
            collapsingToolbar.setTitle(bacaan);

            ayat.setText(ayat1);
            arti.setText(arti1);

            keterangan.setText("Maha Penerima Taubat, yaitu memberikan pertolongan kepada orang-orang yang melakukan maksiat untuk bertaubat lalu Allah akan menerimanya.");

            meneladani.setText("Bila seseoarang rajin membaca Yaa Tawwaab berulang-ulang, dengan seizin Allah, Allah akan menerima tobatnya.");
        } else if (position == 81) {
            collapsingToolbar.setTitle(bacaan);

            ayat.setText(ayat1);
            arti.setText(arti1);

            keterangan.setText("Maha Penyiksa / Yang Maha Menghukum, kepada mereka yang bersalah dan orang yang berhak untuk memperoleh siksaNya.");

            meneladani.setText("Bila seseorang rajin membaca Yaa Muntaqim berulang-ulang, dengan seizin Allah, Allah akan memberinya kemenangan bila ia berhadapan dengan musuh.");
        } else if (position == 82) {
            collapsingToolbar.setTitle(bacaan);

            ayat.setText(ayat1);
            arti.setText(arti1);

            keterangan.setText("Maha Pemaaf / Yang Maha Pengampun, menghapuskan kesalahan orang yang suka kembali untuk meminta maaf padaNya.");

            meneladani.setText("Bila seseorang rajin membaca Yaa Afuww berulang-ulang, dengan seizin Allah, Allah akan mengampuni dosa-dosanya.");
        } else if (position == 83) {
            collapsingToolbar.setTitle(bacaan);

            ayat.setText(ayat1);
            arti.setText(arti1);

            keterangan.setText("Maha Pengasih / Maha Mengasihi, banyak kerahmatan dan kasih sayangNya.");

            meneladani.setText("Bila Seseorang rajin membaca Yaa Roo`uuf berulang-ulang, dengan seizin Allah, ia akan mendapatkan keberkahan dari Allah.");
        } else if (position == 84) {
            collapsingToolbar.setTitle(bacaan);

            ayat.setText(ayat1);
            arti.setText(arti1);

            keterangan.setText("Maha Pemilik Kekuasaan / Maha Menguasai kerajaan / Pemilik Kedaulatan Yang Kekal, maka segala perkara yang berlaku di alam semesta, langit, bumi dan sekitarnya serta yang di alam semesta itu semuanya sesuai dengan kehendak dan iradatNya.");

            meneladani.setText("Bila seseorang rajin membaca Yaa Maalikul-Mulk berulang-ulang, dengan seizin Allah, Allah akan memberi martabat dan harga diri kepadanya di mata manusia.");
        } else if (position == 85) {
            collapsingToolbar.setTitle(bacaan);

            ayat.setText(ayat1);
            arti.setText(arti1);

            keterangan.setText("Maha Pemilik Keagungan dan Kemuliaan / Maha Memiliki Kebesaran dan Kemuliaan. Juga Zat yang mempunyai keutamaan dan kesempurnaan, pemberi kurnia dan kenikmatan yang amat banyak dan melimpah ruah.");

            meneladani.setText("Bila seseorang rajin membaca Yaa Dzul-Jalaali-Wal-Ikroom, dengan seizin Allah, Allah akan memberinya kekayaan.");
        } else if (position == 86) {
            collapsingToolbar.setTitle(bacaan);

            ayat.setText(ayat1);
            arti.setText(arti1);

            keterangan.setText("Maha Mengadili / Maha Saksama, yaitu memberikan kemenangan pada orang-orang yang teraniaya dari tindakan orang-orang yang menganiaya dengan keadilanNya.");

            meneladani.setText("Bila seseorang rajin membaca Yaa Muqsith berulang-ulang, dengan seizin Allah, Allah akan melindunginya dari gangguan setan.");
        } else if (position == 87) {
            collapsingToolbar.setTitle(bacaan);

            ayat.setText(ayat1);
            arti.setText(arti1);

            keterangan.setText("Maha Mengumpulkan / Maha Pengumpul, yaitu mengumpulkan berbagai hakikat yang telah bercerai-berai dan juga mengumpulkan seluruh umat manusia pada hari pembalasan.");

            meneladani.setText("Bila seseorang kehilangan sesuatu, ia bisa membaca Yaa jaami` berulang-ulang. Allah akan membantu mempermudah pencarian barangnya yang hilang itu. ");
        } else if (position == 88) {
            collapsingToolbar.setTitle(bacaan);

            ayat.setText(ayat1);
            arti.setText(arti1);

            keterangan.setText("Maha Kaya Raya / Maha Kaya serta Serba Lengkap, yaitu tidak berkehendakkan apa juapun dari yang selain ZatNya sendiri, tetapi yang selainNya itu amat mengharapkan padaNya.");

            meneladani.setText("Bila seseorang rajin membaca Yaa Ghaniyy, dengan seizin Allah, Allah akan memberinya perasaan cukup dengan apa yang dimiliki dan tidak akan dijangkiti sifat serakah. ");
        } else if (position == 89) {
            collapsingToolbar.setTitle(bacaan);

            ayat.setText(ayat1);
            arti.setText(arti1);

            keterangan.setText("Maha Pemberi kekayaan / Maha Mengkayakan dan Memakmurkan, yaitu memberikan kelebihan yang berupa kekayaan yang berlimpah-ruah kepada siapa saja yang dikehendaki dari golongan hamba-hambaNya.");

            meneladani.setText("Bila seseorang rajin membaca Yaa Mughnii sebanyak sepuluh kali selama sepuluh jumat, dengan seizin Allah, Allah akan mencukupi kebutuhannya. ");
        } else if (position == 90) {
            collapsingToolbar.setTitle(bacaan);

            ayat.setText(ayat1);
            arti.setText(arti1);

            keterangan.setText("Maha Membela atau Maha Menolak / Maha Pencegah, yaitu membela hamba-hambaNya yang soleh dan menolak sebab-sebab yang menyebabkan kerosakan.");

            meneladani.setText("Bagi orang yang sudah berumah tangga, bila rajin membaca Yaa Maani`, dengan seizin Allah, Allah akan memberi ketenteraman hidup dalam rumah tangganya.");
        } else if (position == 91) {
            collapsingToolbar.setTitle(bacaan);

            ayat.setText(ayat1);
            arti.setText(arti1);

            keterangan.setText("Maha Mendatangkan Mudharat / Maha Pembuat Bahaya / Maha Pemberi bahaya, yaitu dengan menurunkan seksa-seksaNya kepada musuh-musuhNya.");

            meneladani.setText("Bila seseorang rajin membaca Yaa Dhaar pada malam jum`at, dengan seizin Allah, Allah akan mengangkat derajat dan kedudukannya ke tempat yang lebih tinggi.");
        } else if (position == 92) {
            collapsingToolbar.setTitle(bacaan);

            ayat.setText(ayat1);
            arti.setText(arti1);

            keterangan.setText("Maha Pemberi Manfaat, yaitu meluaslah kebaikan yang dikurniakanNya itu kepada semua hamba, masyarakat dan negeri.");

            meneladani.setText("Bila seseorang membaca Yaa Naafi` empat hari berturut-turut, maka dengan seizin Allah, ia bakal terhindar dari banyak gangguan.");
        } else if (position == 93) {
            collapsingToolbar.setTitle(bacaan);

            ayat.setText(ayat1);
            arti.setText(arti1);

            keterangan.setText("Maha Pemberi Cahaya / Maha Bercahaya, yaitu menonjokan ZatNya sendiri dan menampakkan untuk yang selainNya dengan menunjukkan tanda-tanda kekuasaanNya.");

            meneladani.setText("Bila Seseorang rajin membaca Yaa Nuur, maka dengan seizin Allah, Allah akan memberinya karunia cahaya batiniah. Dan Allah juga akan memberinya pengetahuan untuk mengetahui hal-hal yang tersembunyi. ");
        } else if (position == 94) {
            collapsingToolbar.setTitle(bacaan);

            ayat.setText(ayat1);
            arti.setText(arti1);

            keterangan.setText("Maha Pemberi Petunjuk / Yang Memimpin dan Memberi Pertunjuk, yaitu memberikan jalan yang benar kepada segala sesuatu agar berterusan adanya dan terjaga kehidupannya.");

            meneladani.setText("Bila seseorang ingin memiliki pengetahuan spiritual dan makrifat atau ilmu mengenai Allah SWT. Maka perbanyaklah membaca Yaa Haadii.");
        } else if (position == 95) {
            collapsingToolbar.setTitle(bacaan);

            ayat.setText(ayat1);
            arti.setText(arti1);

            keterangan.setText("Maha Indah / Tiada Bandingan / Maha Pencipta yang baru, sehingga tidak ada contoh dan yang menyamai sebelum keluarnya ciptaanNya itu.");

            meneladani.setText("Bila seseorang membaca Yaa Badii`assamaawaati wal ardh (wahai Sang Pencipta segala sesuatu yang tiada banding di muka bumi dan jagat alam semesta) sebanyak tujuh puluh kali maka dengan seizin Allah, segala kesulitan yang menimpanya akan berakhir.");
        } else if (position == 96) {
            collapsingToolbar.setTitle(bacaan);

            ayat.setText(ayat1);
            arti.setText(arti1);

            keterangan.setText("Maha Kekal, yaitu kekal hidupNya untuk selama-lamanya.");

            meneladani.setText("Bila seseorang membaca Yaa Baaqii seratus kali sebelum matahari terbit maka, dengan seizin Allah, ia akan terbebas dari seluruh bencana di sepanjang hidupnya. Dan di akhirat kelak, ia akan dikasihi oleh Allah SWT. ");
        } else if (position == 97) {
            collapsingToolbar.setTitle(bacaan);

            ayat.setText(ayat1);
            arti.setText(arti1);

            keterangan.setText("Maha Membahagi / Maha Mewarisi / Maha Pewaris, yaitu kekal setelah musnahnya seluruh makhluk.");

            meneladani.setText("Bila seseorang sering membaca Yaa Waarits maka Allah akan memperpanjang usianya. ");
        } else if (position == 98) {
            collapsingToolbar.setTitle(bacaan);

            ayat.setText(ayat1);
            arti.setText(arti1);

            keterangan.setText("Maha Cendekiawan / Maha Pandai / Bijaksana / Maha Memimpin, yaitu yang memimpin kepada kebenaran, yaitu memberi penerangan dan panduan pada seluruh hambaNya dan segala peraturanNya itu berjalan mengikut ketentuan yang digariskan oleh kebijaksanaan dan kecendekiawanNya.");

            meneladani.setText("Bila seseorang membaca Yaa Rosyiid sebanyak seribu kali, yaitu diantara waktu shalat Maghrib dan shalat Isya, dengan seizin Allah, berbagai persoalannya akan terselesaikan.");
        } else if (position == 99) {
            collapsingToolbar.setTitle(bacaan);

            ayat.setText(ayat1);
            arti.setText(arti1);

            keterangan.setText("Maha Penyabar yang tidak tergesa-gesa memberikan seksaan dan tidak juga cepat melaksanakan sesuatu sebelum masanya.");

            meneladani.setText("Ketika seseorang dalam kesulitan atau berduka, bacalah Yaa Shobuur sebanyak tiga ribu kali, dengan izin Allah, Allah akan memberinya jalan keluar. Jika Yaa Shobuur dibaca sebanyak seribu kali, Allah akan memberinya ilham berupa kesabaran atas segala kesusahan dan bala bencana yang menimpanya.");
        }
    }

    //Tombol Kembali
    public boolean onOptionsItemSelected(MenuItem item) {
        Intent myIntent = new Intent(getApplicationContext(), ActivityAsmaulHusna.class);
        startActivityForResult(myIntent, 0);
        finish();
        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if ((keyCode == KeyEvent.KEYCODE_BACK)) {
            Intent myIntent = new Intent(getApplicationContext(), ActivityAsmaulHusna.class);
            startActivityForResult(myIntent, 0);
            finish();
            return true;
        }
        return super.onKeyDown(keyCode, event);
    }
}
