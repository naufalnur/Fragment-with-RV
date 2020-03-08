package com.example.fragmentwithrv;

import java.util.ArrayList;

public class ShoesData {
    private static String[] ShoesNames = {
            "Adidas 3MC Vulg",
            "Adidas Court 70s",
            "Adidas Dame 5",
            "Adidas EQT Support",
            "Adidas Falcon",
            "Adidas Pharell William NMD",
            "Adidas Yung 96",

    };

    private static String[] ShoesDetails = {
            "Combining skate-friendly design with a clean, classic profile, these shoes are in their element on or off the board. Their highly versatile style is rider-friendly, with a reinforced canvas upper and an ultra-flexible Geoflex outsole that moves naturally with your foot and has great board feel. A look for everyone Clean canvas upper plus a vulcanised outsole with classic white sidewalls offer skate style everyone can enjoy Heritage details Gazelle-inspired textured sidewalls, heel patch and raised 3-Stripes show off adidas heritage Accessible design Wide outsole accommodates feet of all shapes.",
            "A stripped-down court style, these shoes borrow inspiration from the '70s to create a minimalist look. Featuring a smooth leather upper and classic 3-Stripes, the shoes have a cushioned sockliner for comfort in every step.",
            "Made to play fresh out of the box, these low top basketball shoes are designed for Damian Lillard's signature style. Built with a textile upper, they feature flexible cushioning for lightweight comfort on every step-back jumper. The herringbone outsole lets you change directions on a dime. Lightweight cushioning Bounce cushioning provides enhanced comfort and flexibility Enhanced traction Rubber outsole with herringbone pattern for ultimate grip.",
            "First launched in the '90s, Equipment was defined by a stripped-down aesthetic that focused on performance rather than frills. These shoes take that idea to a new place, refining and amplifying some of the most iconic EQT details. The mesh sock-like upper incorporates faux suede into the design. Webbing 3-Stripes tie into the lacing system and extend to the sculpted midsole.",
            "A little retro. A lot of attitude. These adidas Falcon Shoes scream '90s style, big hair, acid wash and all. Go ahead, relive the glory days of the chunky heel.",
            "Pharrell's Hu collection celebrates the hues of humanity. These SOLARHU NMD shoes combine a supportive adidas Primeknit upper with the energy return of Boost.",
            "Authentic '90s adidas vibes are transformed into a bold, confident look. These shoes put a daring spin on retro running style. The upper is made up of layered mesh and nubuck. A lightweight EVA midsole gives them all-day wearability. Inspired by playful '90s fashion Layered upper and chunky outsole recall '90s style trends Built for all-day comfort Cushioned with a lightweight EVA midsole and lined with breathable mesh Authentic Torsion System bar Torsion System for midfoot stability."
    };

    private static int[] ShoesImages = {
            R.drawable.adidas_3mc_vulg,
            R.drawable.adidas_court_70s,
            R.drawable.adidas_dame5,
            R.drawable.adidas_eqt_support,
            R.drawable.adidas_falcon,
            R.drawable.adidas_pw_nmd,
            R.drawable.adidas_yung_96,
    };

    public static ArrayList<ShoesModel> getShoeList(){
        ShoesModel shoes = null;
        ArrayList<ShoesModel> list = new ArrayList<>();

        for (int i = 0; i < ShoesNames.length; i++){
            shoes = new ShoesModel();
            shoes.setShoesImage(ShoesImages[i]);
            shoes.setShoesName(ShoesNames[i]);
            shoes.setShoesDetail(ShoesDetails[i]);
            list.add(shoes);
        }
        return list;
    }
}

