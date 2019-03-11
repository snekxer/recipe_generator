package Front;
import Models.*;
import Data.*;
import javax.swing.*;
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


public class form extends javax.swing.JFrame {


    public form() {
        initComponents();
    }

    datasets data = new datasets();
    ArrayList<Ingredient> ingredients = new ArrayList<>();
    ArrayList<Ingredient> tempDiary = new ArrayList<>();
    ArrayList<Ingredient> tempVegetarian = new ArrayList<>();
    ArrayList<Ingredient> tempVegan = new ArrayList<>();

    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        eggplantC = new javax.swing.JCheckBox();
        cabbageC = new javax.swing.JCheckBox();
        onionC = new javax.swing.JCheckBox();
        aspargusC = new javax.swing.JCheckBox();
        greenBeansC = new javax.swing.JCheckBox();
        leekC = new javax.swing.JCheckBox();
        beetC = new javax.swing.JCheckBox();
        aurugulaC = new javax.swing.JCheckBox();
        tomatoC = new javax.swing.JCheckBox();
        carrotC = new javax.swing.JCheckBox();
        brocoliC = new javax.swing.JCheckBox();
        spinachC = new javax.swing.JCheckBox();
        soySproutsC = new javax.swing.JCheckBox();
        zucciniC = new javax.swing.JCheckBox();
        cauliflowerC = new javax.swing.JCheckBox();
        cucumberC = new javax.swing.JCheckBox();
        radishC = new javax.swing.JCheckBox();
        edamameC = new javax.swing.JCheckBox();
        turnipC = new javax.swing.JCheckBox();
        picklesC = new javax.swing.JCheckBox();
        celeryC = new javax.swing.JCheckBox();
        pepperC = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();
        kiwiC = new javax.swing.JCheckBox();
        watermelonC = new javax.swing.JCheckBox();
        peachC = new javax.swing.JCheckBox();
        mangoC = new javax.swing.JCheckBox();
        jLabel2 = new javax.swing.JLabel();
        strawberryC = new javax.swing.JCheckBox();
        pineappleC = new javax.swing.JCheckBox();
        mandarinC = new javax.swing.JCheckBox();
        grapeC = new javax.swing.JCheckBox();
        appleC = new javax.swing.JCheckBox();
        raisinC = new javax.swing.JCheckBox();
        blackberryC = new javax.swing.JCheckBox();
        papayaC = new javax.swing.JCheckBox();
        orangeC = new javax.swing.JCheckBox();
        pearC = new javax.swing.JCheckBox();
        bananaC = new javax.swing.JCheckBox();
        coconutC = new javax.swing.JCheckBox();
        figC = new javax.swing.JCheckBox();
        cantaloupeC = new javax.swing.JCheckBox();
        quinoa = new javax.swing.JCheckBox();
        muesliC = new javax.swing.JCheckBox();
        brownRiceC = new javax.swing.JCheckBox();
        sweetPotatoC = new javax.swing.JCheckBox();
        tortillaC = new javax.swing.JCheckBox();
        plantainC = new javax.swing.JCheckBox();
        granolaBarC = new javax.swing.JCheckBox();
        saltCrackersC = new javax.swing.JCheckBox();
        potatoC = new javax.swing.JCheckBox();
        oatmealC = new javax.swing.JCheckBox();
        oatsC = new javax.swing.JCheckBox();
        cassavaC = new javax.swing.JCheckBox();
        jLabel3 = new javax.swing.JLabel();
        wildRiceC = new javax.swing.JCheckBox();
        cornC = new javax.swing.JCheckBox();
        couscousC = new javax.swing.JCheckBox();
        wholeWheatBreadC = new javax.swing.JCheckBox();
        lentilC = new javax.swing.JCheckBox();
        garbanzoC = new javax.swing.JCheckBox();
        limaBeansC = new javax.swing.JCheckBox();
        cookedSoyC = new javax.swing.JCheckBox();
        peasC = new javax.swing.JCheckBox();
        jLabel4 = new javax.swing.JLabel();
        boiledBeansC = new javax.swing.JCheckBox();
        menestraC = new javax.swing.JCheckBox();
        turkeyHamC = new javax.swing.JCheckBox();
        peanutButterC = new javax.swing.JCheckBox();
        chickenC = new javax.swing.JCheckBox();
        turkeyC = new javax.swing.JCheckBox();
        beefC = new javax.swing.JCheckBox();
        porkC = new javax.swing.JCheckBox();
        salmonC = new javax.swing.JCheckBox();
        mozzarellaC = new javax.swing.JCheckBox();
        parmesanC = new javax.swing.JCheckBox();
        tunaC = new javax.swing.JCheckBox();
        chevreC = new javax.swing.JCheckBox();
        jLabel5 = new javax.swing.JLabel();
        shrimpC = new javax.swing.JCheckBox();
        yogurtC = new javax.swing.JCheckBox();
        eggC = new javax.swing.JCheckBox();
        milkC = new javax.swing.JCheckBox();
        sesameSeedsC = new javax.swing.JCheckBox();
        almondsC = new javax.swing.JCheckBox();
        creamyDressingC = new javax.swing.JCheckBox();
        linseedC = new javax.swing.JCheckBox();
        chiaC = new javax.swing.JCheckBox();
        nutsC = new javax.swing.JCheckBox();
        creamCheeseC = new javax.swing.JCheckBox();
        VinagreteC = new javax.swing.JCheckBox();
        oliveOilC = new javax.swing.JCheckBox();
        jLabel6 = new javax.swing.JLabel();
        olivesC = new javax.swing.JCheckBox();
        avocadoC = new javax.swing.JCheckBox();
        mushroomC = new javax.swing.JCheckBox();
        diaryC = new javax.swing.JCheckBox();
        jLabel7 = new javax.swing.JLabel();
        vegetarianC = new javax.swing.JCheckBox();
        veganC = new javax.swing.JCheckBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        recipeTable = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        submit = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        eggplantC.setText("Eggplant");
        eggplantC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eggplantCActionPerformed(evt);
            }
        });

        cabbageC.setText("Cabbage");
        cabbageC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cabbageCActionPerformed(evt);
            }
        });

        onionC.setText("Onion");
        onionC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                onionCActionPerformed(evt);
            }
        });

        aspargusC.setText("Aspargus");
        aspargusC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aspargusCActionPerformed(evt);
            }
        });

        greenBeansC.setText("Green Beans");
        greenBeansC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                greenBeansCActionPerformed(evt);
            }
        });

        leekC.setText("Leek");
        leekC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                leekCActionPerformed(evt);
            }
        });

        beetC.setText("Beet");
        beetC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                beetCActionPerformed(evt);
            }
        });

        aurugulaC.setText("Aurugula");
        aurugulaC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aurugulaCActionPerformed(evt);
            }
        });

        tomatoC.setText("Tomato");
        tomatoC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tomatoCActionPerformed(evt);
            }
        });

        carrotC.setText("Carrot");
        carrotC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                carrotCActionPerformed(evt);
            }
        });

        brocoliC.setText("Brocoli");
        brocoliC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                brocoliCActionPerformed(evt);
            }
        });

        spinachC.setText("Spinach");
        spinachC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                spinachCActionPerformed(evt);
            }
        });

        soySproutsC.setText("Soy Sprouts");
        soySproutsC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                soySproutsCActionPerformed(evt);
            }
        });

        zucciniC.setText("Zuccini");
        zucciniC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zucciniCActionPerformed(evt);
            }
        });

        cauliflowerC.setText("Cauliflower");
        cauliflowerC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cauliflowerCActionPerformed(evt);
            }
        });

        cucumberC.setText("Cucumber");
        cucumberC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cucumberCActionPerformed(evt);
            }
        });

        radishC.setText("Radish");
        radishC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radishCActionPerformed(evt);
            }
        });

        edamameC.setText("Edamame");
        edamameC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edamameCActionPerformed(evt);
            }
        });

        turnipC.setText("Turnip");
        turnipC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                turnipCActionPerformed(evt);
            }
        });

        picklesC.setText("Pickles");
        picklesC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                picklesCActionPerformed(evt);
            }
        });

        celeryC.setText("Celery");
        celeryC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                celeryCActionPerformed(evt);
            }
        });

        pepperC.setText("Pepper");
        pepperC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pepperCActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Vegetables");

        kiwiC.setText("Kiwi");
        kiwiC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kiwiCActionPerformed(evt);
            }
        });

        watermelonC.setText("Watermelon");
        watermelonC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                watermelonCActionPerformed(evt);
            }
        });

        peachC.setText("Peach");
        peachC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                peachCActionPerformed(evt);
            }
        });

        mangoC.setText("Mango");
        mangoC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mangoCActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Fruits");

        strawberryC.setText("Strawberry");
        strawberryC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                strawberryCActionPerformed(evt);
            }
        });

        pineappleC.setText("Pineapple");
        pineappleC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pineappleCActionPerformed(evt);
            }
        });

        mandarinC.setText("Mandarin");
        mandarinC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mandarinCActionPerformed(evt);
            }
        });

        grapeC.setText("Grape");
        grapeC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                grapeCActionPerformed(evt);
            }
        });

        appleC.setText("Apple");
        appleC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                appleCActionPerformed(evt);
            }
        });

        raisinC.setText("Raisin");
        raisinC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                raisinCActionPerformed(evt);
            }
        });

        blackberryC.setText("Blackberry");
        blackberryC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                blackberryCActionPerformed(evt);
            }
        });

        papayaC.setText("Papaya");
        papayaC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                papayaCActionPerformed(evt);
            }
        });

        orangeC.setText("Orange");
        orangeC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orangeCActionPerformed(evt);
            }
        });

        pearC.setText("Pear");
        pearC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pearCActionPerformed(evt);
            }
        });

        bananaC.setText("Banana");
        bananaC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bananaCActionPerformed(evt);
            }
        });

        coconutC.setText("Coconut");
        coconutC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                coconutCActionPerformed(evt);
            }
        });

        figC.setText("Fig");
        figC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                figCActionPerformed(evt);
            }
        });

        cantaloupeC.setText("Cantaloupe");
        cantaloupeC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cantaloupeCActionPerformed(evt);
            }
        });

        quinoa.setText("Quinoa");
        quinoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quinoaActionPerformed(evt);
            }
        });

        muesliC.setText("Muesli");
        muesliC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                muesliCActionPerformed(evt);
            }
        });

        brownRiceC.setText("Brown Rice");
        brownRiceC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                brownRiceCActionPerformed(evt);
            }
        });

        sweetPotatoC.setText("Sweet Potato");
        sweetPotatoC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sweetPotatoCActionPerformed(evt);
            }
        });

        tortillaC.setText("Tortilla");
        tortillaC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tortillaCActionPerformed(evt);
            }
        });

        plantainC.setText("Plantain");
        plantainC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                plantainCActionPerformed(evt);
            }
        });

        granolaBarC.setText("Granola Bar");
        granolaBarC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                granolaBarCActionPerformed(evt);
            }
        });

        saltCrackersC.setText("Salt Crackers");
        saltCrackersC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saltCrackersCActionPerformed(evt);
            }
        });

        potatoC.setText("Potato");
        potatoC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                potatoCActionPerformed(evt);
            }
        });

        oatmealC.setText("Oatmeal");
        oatmealC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oatmealCActionPerformed(evt);
            }
        });

        oatsC.setText("Oats");
        oatsC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oatsCActionPerformed(evt);
            }
        });

        cassavaC.setText("Cassava");
        cassavaC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cassavaCActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Cereals");

        wildRiceC.setText("Wild Rice");
        wildRiceC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                wildRiceCActionPerformed(evt);
            }
        });

        cornC.setText("Corn");
        cornC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cornCActionPerformed(evt);
            }
        });

        couscousC.setText("Couscous");
        couscousC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                couscousCActionPerformed(evt);
            }
        });

        wholeWheatBreadC.setText("Whole Wheat Bread");
        wholeWheatBreadC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                wholeWheatBreadCActionPerformed(evt);
            }
        });

        lentilC.setText("Lentil");
        lentilC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lentilCActionPerformed(evt);
            }
        });

        garbanzoC.setText("Garbanzo");
        garbanzoC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                garbanzoCActionPerformed(evt);
            }
        });

        limaBeansC.setText("Lima Beans");
        limaBeansC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limaBeansCActionPerformed(evt);
            }
        });

        cookedSoyC.setText("Cooked Soy");
        cookedSoyC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cookedSoyCActionPerformed(evt);
            }
        });

        peasC.setText("Peas");
        peasC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                peasCActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Legumen");

        boiledBeansC.setText("Boiled Beans");
        boiledBeansC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boiledBeansCActionPerformed(evt);
            }
        });

        menestraC.setText("Menestra");
        menestraC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menestraCActionPerformed(evt);
            }
        });

        turkeyHamC.setText("Turkey Ham");
        turkeyHamC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                turkeyHamCActionPerformed(evt);
            }
        });

        peanutButterC.setText("Peanut Butter");
        peanutButterC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                peanutButterCActionPerformed(evt);
            }
        });

        chickenC.setText("Chicken");
        chickenC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chickenCActionPerformed(evt);
            }
        });

        turkeyC.setText("Turkey");
        turkeyC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                turkeyCActionPerformed(evt);
            }
        });

        beefC.setText("Beef");
        beefC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                beefCActionPerformed(evt);
            }
        });

        porkC.setText("Pork");
        porkC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                porkCActionPerformed(evt);
            }
        });

        salmonC.setText("Salmon");
        salmonC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salmonCActionPerformed(evt);
            }
        });

        mozzarellaC.setText("Mozzarella");
        mozzarellaC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mozzarellaCActionPerformed(evt);
            }
        });

        parmesanC.setText("Parmesan");
        parmesanC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                parmesanCActionPerformed(evt);
            }
        });

        tunaC.setText("Tuna");
        tunaC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tunaCActionPerformed(evt);
            }
        });

        chevreC.setText("Chevre");
        chevreC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chevreCActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Protein");

        shrimpC.setText("Shrimp");
        shrimpC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                shrimpCActionPerformed(evt);
            }
        });

        yogurtC.setText("Yogurt");
        yogurtC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yogurtCActionPerformed(evt);
            }
        });

        eggC.setText("Egg");
        eggC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eggCActionPerformed(evt);
            }
        });

        milkC.setText("Milk");
        milkC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                milkCActionPerformed(evt);
            }
        });

        sesameSeedsC.setText("Sesame Seeds");
        sesameSeedsC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sesameSeedsCActionPerformed(evt);
            }
        });

        almondsC.setText("Almonds");
        almondsC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                almondsCActionPerformed(evt);
            }
        });

        creamyDressingC.setText("Creamy Dressing");
        creamyDressingC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                creamyDressingCActionPerformed(evt);
            }
        });

        linseedC.setText("Linseed");
        linseedC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                linseedCActionPerformed(evt);
            }
        });

        chiaC.setText("Chia");
        chiaC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chiaCActionPerformed(evt);
            }
        });

        nutsC.setText("Nuts");
        nutsC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nutsCActionPerformed(evt);
            }
        });

        creamCheeseC.setText("Cream Cheese");
        creamCheeseC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                creamCheeseCActionPerformed(evt);
            }
        });

        VinagreteC.setText("Vinagrete");
        VinagreteC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VinagreteCActionPerformed(evt);
            }
        });

        oliveOilC.setText("Olive Oil");
        oliveOilC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oliveOilCActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Fat");

        olivesC.setText("Olives");
        olivesC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                olivesCActionPerformed(evt);
            }
        });

        avocadoC.setText("Avocado");
        avocadoC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                avocadoCActionPerformed(evt);
            }
        });

        mushroomC.setText("Mushroom");
        mushroomC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mushroomCActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Limit/Avoid:");

        diaryC.setText("Diary");
        diaryC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                diaryCActionPerformed(evt);
            }
        });

        vegetarianC.setText("Vegetarian");
        vegetarianC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vegetarianCActionPerformed(evt);
            }
        });

        veganC.setText("Vegan");
        veganC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                veganCActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Recipe:");



        submit.setText("Submit!");
        submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel9.setText("Recipe Generator");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                .addComponent(greenBeansC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                        .addComponent(edamameC)
                                                                        .addComponent(cucumberC))
                                                                .addComponent(eggplantC)
                                                                .addComponent(cabbageC)
                                                                .addComponent(onionC)
                                                                .addComponent(aspargusC)
                                                                .addComponent(leekC)
                                                                .addComponent(beetC)
                                                                .addComponent(aurugulaC)
                                                                .addComponent(tomatoC)
                                                                .addComponent(carrotC)
                                                                .addComponent(brocoliC)
                                                                .addComponent(spinachC)
                                                                .addComponent(soySproutsC)
                                                                .addComponent(zucciniC)
                                                                .addComponent(cauliflowerC)
                                                                .addComponent(celeryC)
                                                                .addComponent(pepperC)
                                                                .addComponent(radishC)
                                                                .addComponent(turnipC)
                                                                .addComponent(picklesC, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                        .addComponent(mushroomC))
                                                .addGap(28, 28, 28)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(blackberryC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(peachC)
                                                        .addComponent(strawberryC)
                                                        .addComponent(mandarinC)
                                                        .addComponent(appleC)
                                                        .addComponent(orangeC)
                                                        .addComponent(pearC)
                                                        .addComponent(bananaC)
                                                        .addComponent(coconutC)
                                                        .addComponent(figC)
                                                        .addComponent(kiwiC)
                                                        .addComponent(mangoC)
                                                        .addComponent(pineappleC)
                                                        .addComponent(grapeC)
                                                        .addComponent(raisinC)
                                                        .addComponent(cantaloupeC)
                                                        .addComponent(watermelonC)
                                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(papayaC))
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                        .addComponent(brownRiceC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                        .addComponent(oatsC)
                                                                        .addComponent(wildRiceC)
                                                                        .addComponent(couscousC)
                                                                        .addComponent(quinoa)
                                                                        .addComponent(sweetPotatoC)
                                                                        .addComponent(tortillaC)
                                                                        .addComponent(plantainC)
                                                                        .addComponent(granolaBarC)
                                                                        .addComponent(saltCrackersC)
                                                                        .addComponent(potatoC)
                                                                        .addComponent(cassavaC)
                                                                        .addComponent(cornC)
                                                                        .addComponent(wholeWheatBreadC)
                                                                        .addComponent(muesliC)
                                                                        .addComponent(oatmealC)
                                                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGap(18, 18, 18)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(garbanzoC, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(peasC)
                                                                        .addComponent(boiledBeansC)
                                                                        .addComponent(menestraC)
                                                                        .addComponent(lentilC)
                                                                        .addComponent(limaBeansC)
                                                                        .addComponent(cookedSoyC)
                                                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGap(18, 18, 18)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                        .addComponent(chickenC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                        .addComponent(tunaC)
                                                                        .addComponent(shrimpC)
                                                                        .addComponent(eggC)
                                                                        .addComponent(turkeyHamC)
                                                                        .addComponent(turkeyC)
                                                                        .addComponent(beefC)
                                                                        .addComponent(porkC)
                                                                        .addComponent(salmonC)
                                                                        .addComponent(mozzarellaC)
                                                                        .addComponent(parmesanC)
                                                                        .addComponent(chevreC)
                                                                        .addComponent(yogurtC)
                                                                        .addComponent(milkC)
                                                                        .addComponent(peanutButterC)
                                                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGap(18, 18, 18)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                        .addComponent(almondsC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                        .addComponent(oliveOilC)
                                                                        .addComponent(olivesC)
                                                                        .addComponent(avocadoC)
                                                                        .addComponent(sesameSeedsC)
                                                                        .addComponent(creamyDressingC)
                                                                        .addComponent(linseedC)
                                                                        .addComponent(chiaC)
                                                                        .addComponent(nutsC)
                                                                        .addComponent(creamCheeseC)
                                                                        .addComponent(VinagreteC)
                                                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                                .addComponent(diaryC)
                                                                                .addComponent(vegetarianC)
                                                                                .addComponent(veganC))
                                                                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addComponent(submit, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(111, 111, 111)))
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(203, 203, 203)
                                                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(337, 337, 337)
                                                .addComponent(jLabel9)))
                                .addContainerGap(28, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(jLabel9)
                                .addGap(32, 32, 32)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel5)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(tunaC)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(shrimpC)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(eggC)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(turkeyHamC)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(chickenC)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(turkeyC)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(beefC)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(porkC)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(salmonC)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(mozzarellaC)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(parmesanC)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(chevreC)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(yogurtC)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(milkC)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(peanutButterC))
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel6)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(oliveOilC)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(olivesC)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(avocadoC)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(sesameSeedsC)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(almondsC)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(creamyDressingC)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(linseedC)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(chiaC)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(nutsC)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(creamCheeseC)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(VinagreteC))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(27, 27, 27)
                                                                .addComponent(jLabel7)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addGroup(layout.createSequentialGroup()
                                                        .addComponent(jLabel3)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                        .addComponent(oatsC)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(wildRiceC)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(couscousC)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(quinoa)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(brownRiceC)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(sweetPotatoC)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(tortillaC)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(plantainC)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(granolaBarC)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(saltCrackersC)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(potatoC)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(cassavaC)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(cornC)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(wholeWheatBreadC)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(muesliC)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(oatmealC)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addComponent(jLabel8)
                                                                .addGroup(layout.createSequentialGroup()
                                                                        .addGap(20, 20, 20)
                                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                                .addComponent(submit, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addGroup(layout.createSequentialGroup()
                                                                                        .addComponent(diaryC)
                                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                        .addComponent(vegetarianC)))
                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                        .addComponent(veganC))))
                                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addGroup(layout.createSequentialGroup()
                                                                        .addComponent(jLabel4)
                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                        .addComponent(peasC)
                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                        .addComponent(boiledBeansC)
                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                        .addComponent(menestraC)
                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                        .addComponent(lentilC)
                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                        .addComponent(garbanzoC)
                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                        .addComponent(limaBeansC)
                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                        .addComponent(cookedSoyC))
                                                                .addGroup(layout.createSequentialGroup()
                                                                        .addComponent(jLabel2)
                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                        .addComponent(peachC)
                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                        .addComponent(strawberryC)
                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                        .addComponent(mandarinC)
                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                        .addComponent(appleC, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                        .addComponent(blackberryC)
                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                        .addComponent(orangeC)
                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                        .addComponent(pearC)
                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                        .addComponent(bananaC)
                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                        .addComponent(coconutC)
                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                        .addComponent(figC)
                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                        .addComponent(kiwiC)
                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                        .addComponent(mangoC)
                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                        .addComponent(pineappleC)
                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                        .addComponent(grapeC)
                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                        .addComponent(raisinC)
                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                        .addComponent(cantaloupeC)
                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                        .addComponent(watermelonC)
                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                        .addComponent(papayaC))
                                                                .addGroup(layout.createSequentialGroup()
                                                                        .addComponent(jLabel1)
                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                        .addComponent(eggplantC)
                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                        .addComponent(cabbageC)
                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                        .addComponent(onionC)
                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                        .addComponent(aspargusC)
                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                        .addComponent(greenBeansC)
                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                        .addComponent(leekC)
                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                        .addComponent(beetC)
                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                        .addComponent(aurugulaC)
                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                        .addComponent(tomatoC)
                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                        .addComponent(carrotC)
                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                        .addComponent(brocoliC)
                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                        .addComponent(spinachC)
                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                        .addComponent(soySproutsC)
                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                        .addComponent(zucciniC)
                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                        .addComponent(cauliflowerC)
                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                        .addComponent(celeryC)
                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                        .addComponent(pepperC)
                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                        .addComponent(cucumberC)
                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                        .addComponent(radishC)
                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                        .addComponent(edamameC)
                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                        .addComponent(turnipC)
                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                        .addComponent(picklesC)))
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(mushroomC))))
                                .addContainerGap(9, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>


    private void eggplantCActionPerformed(java.awt.event.ActionEvent evt) {
        if(eggplantC.isSelected()){
            ingredients.add(data.eggplant);
        } else if(ingredients.contains(data.eggplant)){
            int i = ingredients.indexOf(data.eggplant);
            ingredients.remove(i);
        }
    }

    private void cabbageCActionPerformed(java.awt.event.ActionEvent evt) {
        if(cabbageC.isSelected()){
            ingredients.add(data.cabbage);
        } else if(ingredients.contains(data.cabbage)){
            int i = ingredients.indexOf(data.cabbage);
            ingredients.remove(i);
        }
    }

    private void greenBeansCActionPerformed(java.awt.event.ActionEvent evt) {
        if(greenBeansC.isSelected()){
            ingredients.add(data.green_beans);
        } else if(ingredients.contains(data.green_beans)){
            int i = ingredients.indexOf(data.green_beans);
            ingredients.remove(i);
        }
    }

    private void peachCActionPerformed(java.awt.event.ActionEvent evt) {
        if(peachC.isSelected()){
            ingredients.add(data.peach);
        } else if(ingredients.contains(data.peach)){
            int i = ingredients.indexOf(data.peach);
            ingredients.remove(i);
        }
    }

    private void strawberryCActionPerformed(java.awt.event.ActionEvent evt) {
        if(strawberryC.isSelected()){
            ingredients.add(data.strawberry);
        } else if(ingredients.contains(data.strawberry)){
            int i = ingredients.indexOf(data.strawberry);
            ingredients.remove(i);
        }
    }

    private void blackberryCActionPerformed(java.awt.event.ActionEvent evt) {
        if(blackberryC.isSelected()){
            ingredients.add(data.blackberry);
        } else if(ingredients.contains(data.blackberry)){
            int i = ingredients.indexOf(data.blackberry);
            ingredients.remove(i);
        }
    }

    private void pineappleCActionPerformed(java.awt.event.ActionEvent evt) {
        if(pineappleC.isSelected()){
            ingredients.add(data.pineapple);
        } else if(ingredients.contains(data.pineapple)){
            int i = ingredients.indexOf(data.pineapple);
            ingredients.remove(i);
        }
    }

    private void brownRiceCActionPerformed(java.awt.event.ActionEvent evt) {
        if(brownRiceC.isSelected()){
            ingredients.add(data.brownRice);
        } else if(ingredients.contains(data.brownRice)){
            int i = ingredients.indexOf(data.brownRice);
            ingredients.remove(i);
        }
    }

    private void oatsCActionPerformed(java.awt.event.ActionEvent evt) {
        if(oatsC.isSelected()){
            ingredients.add(data.rawOat);
        } else if(ingredients.contains(data.rawOat)){
            int i = ingredients.indexOf(data.rawOat);
            ingredients.remove(i);
        }
    }

    private void wildRiceCActionPerformed(java.awt.event.ActionEvent evt) {
        if(wildRiceC.isSelected()){
            ingredients.add(data.wildRice);
        } else if(ingredients.contains(data.wildRice)){
            int i = ingredients.indexOf(data.wildRice);
            ingredients.remove(i);
        }
    }

    private void cornCActionPerformed(java.awt.event.ActionEvent evt) {
        if(cornC.isSelected()){
            ingredients.add(data.corn);
        } else if(ingredients.contains(data.corn)){
            int i = ingredients.indexOf(data.corn);
            ingredients.remove(i);
        }
    }

    private void garbanzoCActionPerformed(java.awt.event.ActionEvent evt) {
        if(garbanzoC.isSelected()){
            ingredients.add(data.garbanzo);
        } else if(ingredients.contains(data.garbanzo)){
            int i = ingredients.indexOf(data.garbanzo);
            ingredients.remove(i);
        }
    }

    private void peasCActionPerformed(java.awt.event.ActionEvent evt) {
        if(peasC.isSelected()){
            ingredients.add(data.peas);
        } else if(ingredients.contains(data.peas)){
            int i = ingredients.indexOf(data.peas);
            ingredients.remove(i);
        }
    }

    private void boiledBeansCActionPerformed(java.awt.event.ActionEvent evt) {
        if(boiledBeansC.isSelected()){
            ingredients.add(data.boiledBeans);
        } else if(ingredients.contains(data.boiledBeans)){
            int i = ingredients.indexOf(data.boiledBeans);
            ingredients.remove(i);
        }
    }

    private void chickenCActionPerformed(java.awt.event.ActionEvent evt) {
        if(chickenC.isSelected()){
            ingredients.add(data.chicken);
        } else if(ingredients.contains(data.chicken)){
            int i = ingredients.indexOf(data.chicken);
            ingredients.remove(i);
        }
    }

    private void tunaCActionPerformed(java.awt.event.ActionEvent evt) {
        if(tunaC.isSelected()){
            ingredients.add(data.tuna);
        } else if(ingredients.contains(data.tuna)){
            int i = ingredients.indexOf(data.tuna);
            ingredients.remove(i);
        }
    }

    private void shrimpCActionPerformed(java.awt.event.ActionEvent evt) {
        if(shrimpC.isSelected()){
            ingredients.add(data.shrimp);
        } else if(ingredients.contains(data.shrimp)){
            int i = ingredients.indexOf(data.shrimp);
            ingredients.remove(i);
        }
    }

    private void yogurtCActionPerformed(java.awt.event.ActionEvent evt) {
        if(yogurtC.isSelected()){
            ingredients.add(data.yogurt);
        } else if(ingredients.contains(data.yogurt)){
            int i = ingredients.indexOf(data.yogurt);
            ingredients.remove(i);
        }
    }

    private void almondsCActionPerformed(java.awt.event.ActionEvent evt) {
        if(almondsC.isSelected()){
            ingredients.add(data.almonds);
        } else if(ingredients.contains(data.almonds)){
            int i = ingredients.indexOf(data.almonds);
            ingredients.remove(i);
        }
    }

    private void oliveOilCActionPerformed(java.awt.event.ActionEvent evt) {
        if(oliveOilC.isSelected()){
            ingredients.add(data.oliveOil);
        } else if(ingredients.contains(data.oliveOil)){
            int i = ingredients.indexOf(data.oliveOil);
            ingredients.remove(i);
        }
    }

    private void olivesCActionPerformed(java.awt.event.ActionEvent evt) {
        if(olivesC.isSelected()){
            ingredients.add(data.olives);
        } else if(ingredients.contains(data.olives)){
            int i = ingredients.indexOf(data.olives);
            ingredients.remove(i);
        }
    }

    private void mushroomCActionPerformed(java.awt.event.ActionEvent evt) {
        if(mushroomC.isSelected()){
            ingredients.add(data.mushrooms);
        } else if(ingredients.contains(data.mushrooms)){
            int i = ingredients.indexOf(data.mushrooms);
            ingredients.remove(i);
        }
    }

    private void diaryCActionPerformed(java.awt.event.ActionEvent evt) {
        if(diaryC.isSelected()){
            for (int j=0; j<ingredients.size(); j++){
                if(ingredients.get(j).getType()==data.diaryF||ingredients.get(j).getType()==data.diaryP){
                    tempDiary.add(ingredients.get(j));
                    ingredients.remove(j);
                }
            }
        } else if(!tempDiary.isEmpty()){
            ingredients.addAll(tempDiary);
            tempDiary.clear();
        }
    }

    private void vegetarianCActionPerformed(java.awt.event.ActionEvent evt) {
        if(vegetarianC.isSelected()){
            for (int j=0; j<ingredients.size(); j++){
                if(ingredients.get(j).getType()==data.animal){
                    tempVegetarian.add(ingredients.get(j));
                    ingredients.remove(j);
                }
            }
        } else if(!tempVegetarian.isEmpty()){
            ingredients.addAll(tempVegetarian);
            tempVegetarian.clear();
        }
    }


    private void VinagreteCActionPerformed(java.awt.event.ActionEvent evt) {
        if(VinagreteC.isSelected()){
            ingredients.add(data.vinagrete);
        } else if(ingredients.contains(data.vinagrete)){
            int i = ingredients.indexOf(data.vinagrete);
            ingredients.remove(i);
        }
    }

    private void onionCActionPerformed(java.awt.event.ActionEvent evt) {
        if(onionC.isSelected()){
            ingredients.add(data.onion);
        } else if(ingredients.contains(data.onion)){
            int i = ingredients.indexOf(data.onion);
            ingredients.remove(i);
        }
    }

    private void pepperCActionPerformed(java.awt.event.ActionEvent evt) {
        if(pepperC.isSelected()){
            ingredients.add(data.greenPepper);
        } else if(ingredients.contains(data.greenPepper)){
            int i = ingredients.indexOf(data.greenPepper);
            ingredients.remove(i);
        }
    }

    private void creamCheeseCActionPerformed(java.awt.event.ActionEvent evt) {
        if(creamCheeseC.isSelected()){
            ingredients.add(data.creamCheese);
        } else if(ingredients.contains(data.creamCheese)){
            int i = ingredients.indexOf(data.creamCheese);
            ingredients.remove(i);
        }
    }

    private void nutsCActionPerformed(java.awt.event.ActionEvent evt) {
        if(nutsC.isSelected()){
            ingredients.add(data.nuts);
        } else if(ingredients.contains(data.nuts)){
            int i = ingredients.indexOf(data.nuts);
            ingredients.remove(i);
        }
    }

    private void chiaCActionPerformed(java.awt.event.ActionEvent evt) {
        if(chiaC.isSelected()){
            ingredients.add(data.chia);
        } else if(ingredients.contains(data.chia)){
            int i = ingredients.indexOf(data.chia);
            ingredients.remove(i);
        }
    }

    private void linseedCActionPerformed(java.awt.event.ActionEvent evt) {
        if(linseedC.isSelected()){
            ingredients.add(data.linseed);
        } else if(ingredients.contains(data.linseed)){
            int i = ingredients.indexOf(data.linseed);
            ingredients.remove(i);
        }
    }

    private void creamyDressingCActionPerformed(java.awt.event.ActionEvent evt) {
        if(creamyDressingC.isSelected()){
            ingredients.add(data.ranchDressing);
        } else if(ingredients.contains(data.ranchDressing)){
            int i = ingredients.indexOf(data.ranchDressing);
            ingredients.remove(i);
        }
    }

    private void sesameSeedsCActionPerformed(java.awt.event.ActionEvent evt) {
        if(sesameSeedsC.isSelected()){
            ingredients.add(data.sesameSeeds);
        } else if(ingredients.contains(data.sesameSeeds)){
            int i = ingredients.indexOf(data.sesameSeeds);
            ingredients.remove(i);
        }
    }

    private void avocadoCActionPerformed(java.awt.event.ActionEvent evt) {
        if(avocadoC.isSelected()){
            ingredients.add(data.avocado);
        } else if(ingredients.contains(data.avocado)){
            int i = ingredients.indexOf(data.avocado);
            ingredients.remove(i);
        }
    }

    private void peanutButterCActionPerformed(java.awt.event.ActionEvent evt) {
        if(peanutButterC.isSelected()){
            ingredients.add(data.peanutButter);
        } else if(ingredients.contains(data.peanutButter)){
            int i = ingredients.indexOf(data.peanutButter);
            ingredients.remove(i);
        }
    }

    private void milkCActionPerformed(java.awt.event.ActionEvent evt) {
        if(milkC.isSelected()){
            ingredients.add(data.milkFatFree);
        } else if(ingredients.contains(data.milkFatFree)){
            int i = ingredients.indexOf(data.milkFatFree);
            ingredients.remove(i);
        }
    }

    private void chevreCActionPerformed(java.awt.event.ActionEvent evt) {
        if(chevreC.isSelected()){
            ingredients.add(data.chevre);
        } else if(ingredients.contains(data.chevre)){
            int i = ingredients.indexOf(data.chevre);
            ingredients.remove(i);
        }
    }

    private void parmesanCActionPerformed(java.awt.event.ActionEvent evt) {
        if(parmesanC.isSelected()){
            ingredients.add(data.parmesan);
        } else if(ingredients.contains(data.parmesan)){
            int i = ingredients.indexOf(data.parmesan);
            ingredients.remove(i);
        }
    }

    private void mozzarellaCActionPerformed(java.awt.event.ActionEvent evt) {
        if(mozzarellaC.isSelected()){
            ingredients.add(data.mozarella);
        } else if(ingredients.contains(data.mozarella)){
            int i = ingredients.indexOf(data.mozarella);
            ingredients.remove(i);
        }
    }

    private void salmonCActionPerformed(java.awt.event.ActionEvent evt) {
        if(salmonC.isSelected()){
            ingredients.add(data.salmon);
        } else if(ingredients.contains(data.salmon)){
            int i = ingredients.indexOf(data.salmon);
            ingredients.remove(i);
        }
    }

    private void porkCActionPerformed(java.awt.event.ActionEvent evt) {
        if(porkC.isSelected()){
            ingredients.add(data.pork);
        } else if(ingredients.contains(data.pork)){
            int i = ingredients.indexOf(data.pork);
            ingredients.remove(i);
        }
    }

    private void beefCActionPerformed(java.awt.event.ActionEvent evt) {
        if(beefC.isSelected()){
            ingredients.add(data.beef);
        } else if(ingredients.contains(data.beef)){
            int i = ingredients.indexOf(data.beef);
            ingredients.remove(i);
        }
    }

    private void turkeyCActionPerformed(java.awt.event.ActionEvent evt) {
        if(turkeyC.isSelected()){
            ingredients.add(data.turkey);
        } else if(ingredients.contains(data.turkey)){
            int i = ingredients.indexOf(data.turkey);
            ingredients.remove(i);
        }
    }

    private void turkeyHamCActionPerformed(java.awt.event.ActionEvent evt) {
        if(turkeyHamC.isSelected()){
            ingredients.add(data.turkeyHam);
        } else if(ingredients.contains(data.turkeyHam)){
            int i = ingredients.indexOf(data.turkeyHam);
            ingredients.remove(i);
        }
    }

    private void eggCActionPerformed(java.awt.event.ActionEvent evt) {
        if(eggC.isSelected()){
            ingredients.add(data.egg);
        } else if(ingredients.contains(data.egg)){
            int i = ingredients.indexOf(data.egg);
            ingredients.remove(i);
        }
    }

    private void cookedSoyCActionPerformed(java.awt.event.ActionEvent evt) {
        if(cookedSoyC.isSelected()){
            ingredients.add(data.cookedSoy);
        } else if(ingredients.contains(data.cookedSoy)){
            int i = ingredients.indexOf(data.cookedSoy);
            ingredients.remove(i);
        }
    }

    private void limaBeansCActionPerformed(java.awt.event.ActionEvent evt) {
        if(limaBeansC.isSelected()){
            ingredients.add(data.limaBeans);
        } else if(ingredients.contains(data.limaBeans)){
            int i = ingredients.indexOf(data.limaBeans);
            ingredients.remove(i);
        }
    }

    private void lentilCActionPerformed(java.awt.event.ActionEvent evt) {
        if(lentilC.isSelected()){
            ingredients.add(data.lentil);
        } else if(ingredients.contains(data.lentil)){
            int i = ingredients.indexOf(data.lentil);
            ingredients.remove(i);
        }
    }

    private void menestraCActionPerformed(java.awt.event.ActionEvent evt) {
        if(menestraC.isSelected()){
            ingredients.add(data.menestra);
        } else if(ingredients.contains(data.menestra)){
            int i = ingredients.indexOf(data.menestra);
            ingredients.remove(i);
        }
    }

    private void veganCActionPerformed(java.awt.event.ActionEvent evt) {
        if(veganC.isSelected()){
            for (int j=0; j<ingredients.size(); j++){
                if(ingredients.get(j).getType()==data.animal||ingredients.get(j).getType()==data.diaryF||ingredients.get(j).getType()==data.diaryP){
                    tempVegan.add(ingredients.get(j));
                    ingredients.remove(j);
                }
            }
        } else if(!tempVegan.isEmpty()){
            ingredients.addAll(tempVegan);
            tempVegan.clear();
        }
    }

    private void oatmealCActionPerformed(java.awt.event.ActionEvent evt) {
        if(oatmealC.isSelected()){
            ingredients.add(data.oatmeal);
        } else if(ingredients.contains(data.oatmeal)){
            int i = ingredients.indexOf(data.oatmeal);
            ingredients.remove(i);
        }
    }

    private void muesliCActionPerformed(java.awt.event.ActionEvent evt) {
        if(muesliC.isSelected()){
            ingredients.add(data.muesli);
        } else if(ingredients.contains(data.muesli)){
            int i = ingredients.indexOf(data.muesli);
            ingredients.remove(i);
        }
    }

    private void wholeWheatBreadCActionPerformed(java.awt.event.ActionEvent evt) {
        if(wholeWheatBreadC.isSelected()){
            ingredients.add(data.wholeWheatBread);
        } else if(ingredients.contains(data.wholeWheatBread)){
            int i = ingredients.indexOf(data.wholeWheatBread);
            ingredients.remove(i);
        }
    }

    private void cassavaCActionPerformed(java.awt.event.ActionEvent evt) {
        if(cassavaC.isSelected()){
            ingredients.add(data.cassava);
        } else if(ingredients.contains(data.cassava)){
            int i = ingredients.indexOf(data.cassava);
            ingredients.remove(i);
        }
    }

    private void potatoCActionPerformed(java.awt.event.ActionEvent evt) {
        if(potatoC.isSelected()){
            ingredients.add(data.potato);
        } else if(ingredients.contains(data.potato)){
            int i = ingredients.indexOf(data.potato);
            ingredients.remove(i);
        }
    }

    private void saltCrackersCActionPerformed(java.awt.event.ActionEvent evt) {
        if(saltCrackersC.isSelected()){
            ingredients.add(data.saltCrackers);
        } else if(ingredients.contains(data.saltCrackers)){
            int i = ingredients.indexOf(data.saltCrackers);
            ingredients.remove(i);
        }
    }

    private void granolaBarCActionPerformed(java.awt.event.ActionEvent evt) {
        if(granolaBarC.isSelected()){
            ingredients.add(data.granolaBar);
        } else if(ingredients.contains(data.granolaBar)){
            int i = ingredients.indexOf(data.granolaBar);
            ingredients.remove(i);
        }
    }

    private void plantainCActionPerformed(java.awt.event.ActionEvent evt) {
        if(plantainC.isSelected()){
            ingredients.add(data.plantain);
        } else if(ingredients.contains(data.plantain)){
            int i = ingredients.indexOf(data.plantain);
            ingredients.remove(i);
        }
    }

    private void tortillaCActionPerformed(java.awt.event.ActionEvent evt) {
        if(tortillaC.isSelected()){
            ingredients.add(data.tortilla);
        } else if(ingredients.contains(data.tortilla)){
            int i = ingredients.indexOf(data.tortilla);
            ingredients.remove(i);
        }
    }

    private void sweetPotatoCActionPerformed(java.awt.event.ActionEvent evt) {
        if(sweetPotatoC.isSelected()){
            ingredients.add(data.sweetPotato);
        } else if(ingredients.contains(data.sweetPotato)){
            int i = ingredients.indexOf(data.sweetPotato);
            ingredients.remove(i);
        }
    }

    private void quinoaActionPerformed(java.awt.event.ActionEvent evt) {
        if(quinoa.isSelected()){
            ingredients.add(data.quinoa);
        } else if(ingredients.contains(data.quinoa)){
            int i = ingredients.indexOf(data.quinoa);
            ingredients.remove(i);
        }
    }

    private void couscousCActionPerformed(java.awt.event.ActionEvent evt) {
        if(couscousC.isSelected()){
            ingredients.add(data.couscous);
        } else if(ingredients.contains(data.couscous)){
            int i = ingredients.indexOf(data.couscous);
            ingredients.remove(i);
        }
    }

    private void papayaCActionPerformed(java.awt.event.ActionEvent evt) {
        if(papayaC.isSelected()){
            ingredients.add(data.papaya);
        } else if(ingredients.contains(data.papaya)){
            int i = ingredients.indexOf(data.papaya);
            ingredients.remove(i);
        }
    }

    private void watermelonCActionPerformed(java.awt.event.ActionEvent evt) {
        if(watermelonC.isSelected()){
            ingredients.add(data.watermelon);
        } else if(ingredients.contains(data.watermelon)){
            int i = ingredients.indexOf(data.watermelon);
            ingredients.remove(i);
        }
    }

    private void cantaloupeCActionPerformed(java.awt.event.ActionEvent evt) {
        if(cantaloupeC.isSelected()){
            ingredients.add(data.cantaloupe);
        } else if(ingredients.contains(data.cantaloupe)){
            int i = ingredients.indexOf(data.cantaloupe);
            ingredients.remove(i);
        }
    }

    private void raisinCActionPerformed(java.awt.event.ActionEvent evt) {
        if(raisinC.isSelected()){
            ingredients.add(data.raisin);
        } else if(ingredients.contains(data.raisin)){
            int i = ingredients.indexOf(data.raisin);
            ingredients.remove(i);
        }
    }

    private void grapeCActionPerformed(java.awt.event.ActionEvent evt) {
        if(grapeC.isSelected()){
            ingredients.add(data.grape);
        } else if(ingredients.contains(data.grape)){
            int i = ingredients.indexOf(data.grape);
            ingredients.remove(i);
        }
    }

    private void mangoCActionPerformed(java.awt.event.ActionEvent evt) {
        if(mangoC.isSelected()){
            ingredients.add(data.mango);
        } else if(ingredients.contains(data.mango)){
            int i = ingredients.indexOf(data.mango);
            ingredients.remove(i);
        }
    }

    private void kiwiCActionPerformed(java.awt.event.ActionEvent evt) {
        if(kiwiC.isSelected()){
            ingredients.add(data.kiwi);
        } else if(ingredients.contains(data.kiwi)){
            int i = ingredients.indexOf(data.kiwi);
            ingredients.remove(i);
        }
    }

    private void figCActionPerformed(java.awt.event.ActionEvent evt) {
        if(figC.isSelected()){
            ingredients.add(data.fig);
        } else if(ingredients.contains(data.fig)){
            int i = ingredients.indexOf(data.fig);
            ingredients.remove(i);
        }
    }

    private void coconutCActionPerformed(java.awt.event.ActionEvent evt) {
        if(coconutC.isSelected()){
            ingredients.add(data.coconut);
        } else if(ingredients.contains(data.coconut)){
            int i = ingredients.indexOf(data.coconut);
            ingredients.remove(i);
        }
    }

    private void bananaCActionPerformed(java.awt.event.ActionEvent evt) {
        if(bananaC.isSelected()){
            ingredients.add(data.banana);
        } else if(ingredients.contains(data.banana)){
            int i = ingredients.indexOf(data.banana);
            ingredients.remove(i);
        }
    }

    private void pearCActionPerformed(java.awt.event.ActionEvent evt) {
        if(pearC.isSelected()){
            ingredients.add(data.pear);
        } else if(ingredients.contains(data.pear)){
            int i = ingredients.indexOf(data.pear);
            ingredients.remove(i);
        }
    }

    private void orangeCActionPerformed(java.awt.event.ActionEvent evt) {
        if(orangeC.isSelected()){
            ingredients.add(data.orange);
        } else if(ingredients.contains(data.orange)){
            int i = ingredients.indexOf(data.orange);
            ingredients.remove(i);
        }
    }

    private void appleCActionPerformed(java.awt.event.ActionEvent evt) {
        if(appleC.isSelected()){
            ingredients.add(data.apple);
        } else if(ingredients.contains(data.apple)){
            int i = ingredients.indexOf(data.apple);
            ingredients.remove(i);
        }
    }

    private void mandarinCActionPerformed(java.awt.event.ActionEvent evt) {
        if(mandarinC.isSelected()){
            ingredients.add(data.mandarin);
        } else if(ingredients.contains(data.mandarin)){
            int i = ingredients.indexOf(data.mandarin);
            ingredients.remove(i);
        }
    }

    private void picklesCActionPerformed(java.awt.event.ActionEvent evt) {
        if(picklesC.isSelected()){
            ingredients.add(data.pickles);
        } else if(ingredients.contains(data.pickles)){
            int i = ingredients.indexOf(data.pickles);
            ingredients.remove(i);
        }
    }

    private void turnipCActionPerformed(java.awt.event.ActionEvent evt) {
        if(turnipC.isSelected()){
            ingredients.add(data.turnip);
        } else if(ingredients.contains(data.turnip)){
            int i = ingredients.indexOf(data.turnip);
            ingredients.remove(i);
        }
    }

    private void edamameCActionPerformed(java.awt.event.ActionEvent evt) {
        if(edamameC.isSelected()){
          //  ingredients.add(data.edamame);
       // } else if(ingredients.contains(data.edamame)){
        //    int i = ingredients.indexOf(data.edamame);
        //    ingredients.remove(i);
        }
    }

    private void radishCActionPerformed(java.awt.event.ActionEvent evt) {
        if(radishC.isSelected()){
            ingredients.add(data.radish);
        } else if(ingredients.contains(data.radish)){
            int i = ingredients.indexOf(data.radish);
            ingredients.remove(i);
        }
    }

    private void cucumberCActionPerformed(java.awt.event.ActionEvent evt) {
        if(cucumberC.isSelected()){
            ingredients.add(data.cucumber);
        } else if(ingredients.contains(data.cucumber)){
            int i = ingredients.indexOf(data.cucumber);
            ingredients.remove(i);
        }
    }

    private void celeryCActionPerformed(java.awt.event.ActionEvent evt) {
        if(celeryC.isSelected()){
            ingredients.add(data.celery);
        } else if(ingredients.contains(data.celery)){
            int i = ingredients.indexOf(data.celery);
            ingredients.remove(i);
        }
    }

    private void cauliflowerCActionPerformed(java.awt.event.ActionEvent evt) {
        if(cauliflowerC.isSelected()){
            ingredients.add(data.cauliflower);
        } else if(ingredients.contains(data.cauliflower)){
            int i = ingredients.indexOf(data.cauliflower);
            ingredients.remove(i);
        }
    }

    private void zucciniCActionPerformed(java.awt.event.ActionEvent evt) {
        if(zucciniC.isSelected()){
            ingredients.add(data.zuccini);
        } else if(ingredients.contains(data.zuccini)){
            int i = ingredients.indexOf(data.zuccini);
            ingredients.remove(i);
        }
    }

    private void soySproutsCActionPerformed(java.awt.event.ActionEvent evt) {
        if(soySproutsC.isSelected()){
            ingredients.add(data.soySprouts);
        } else if(ingredients.contains(data.soySprouts)){
            int i = ingredients.indexOf(data.soySprouts);
            ingredients.remove(i);
        }
    }

    private void spinachCActionPerformed(java.awt.event.ActionEvent evt) {
        if(spinachC.isSelected()){
            ingredients.add(data.spinach);
        } else if(ingredients.contains(data.spinach)){
            int i = ingredients.indexOf(data.spinach);
            ingredients.remove(i);
        }
    }

    private void brocoliCActionPerformed(java.awt.event.ActionEvent evt) {
        if(brocoliC.isSelected()){
            ingredients.add(data.brocoli);
        } else if(ingredients.contains(data.brocoli)){
            int i = ingredients.indexOf(data.brocoli);
            ingredients.remove(i);
        }
    }

    private void carrotCActionPerformed(java.awt.event.ActionEvent evt) {
        if(carrotC.isSelected()){
            ingredients.add(data.carrot);
        } else if(ingredients.contains(data.carrot)){
            int i = ingredients.indexOf(data.carrot);
            ingredients.remove(i);
        }
    }

    private void tomatoCActionPerformed(java.awt.event.ActionEvent evt) {
        if(tomatoC.isSelected()){
            ingredients.add(data.tomato);
        } else if(ingredients.contains(data.tomato)){
            int i = ingredients.indexOf(data.tomato);
            ingredients.remove(i);
        }
    }

    private void aurugulaCActionPerformed(java.awt.event.ActionEvent evt) {
        if(aurugulaC.isSelected()){
            ingredients.add(data.aurugula);
        } else if(ingredients.contains(data.aurugula)){
            int i = ingredients.indexOf(data.aurugula);
            ingredients.remove(i);
        }
    }

    private void beetCActionPerformed(java.awt.event.ActionEvent evt) {
        if(beetC.isSelected()){
            ingredients.add(data.beet);
        } else if(ingredients.contains(data.beet)){
            int i = ingredients.indexOf(data.beet);
            ingredients.remove(i);
        }
    }

    private void leekCActionPerformed(java.awt.event.ActionEvent evt) {
        if(leekC.isSelected()){
            ingredients.add(data.leek);
        } else if(ingredients.contains(data.leek)){
            int i = ingredients.indexOf(data.leek);
            ingredients.remove(i);
        }
    }

    private void aspargusCActionPerformed(java.awt.event.ActionEvent evt) {
        if(aspargusC.isSelected()){
            ingredients.add(data.aspargus);
        } else if(ingredients.contains(data.aspargus)){
            int i = ingredients.indexOf(data.aspargus);
            ingredients.remove(i);
        }
    }

    private void submitActionPerformed(java.awt.event.ActionEvent evt) {

        recipeTable.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {
                        {null, null, null},
                        {null, null, null},
                        {null, null, null},
                        {null, null, null}
                },
                new String [] {
                        "Ingredient", "Quantity", "Measurement"
                }
        ));
        jScrollPane1.setViewportView(recipeTable);
    }


    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new form().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify
    private javax.swing.JCheckBox VinagreteC;
    private javax.swing.JCheckBox almondsC;
    private javax.swing.JCheckBox appleC;
    private javax.swing.JCheckBox aspargusC;
    private javax.swing.JCheckBox aurugulaC;
    private javax.swing.JCheckBox avocadoC;
    private javax.swing.JCheckBox bananaC;
    private javax.swing.JCheckBox beefC;
    private javax.swing.JCheckBox beetC;
    private javax.swing.JCheckBox blackberryC;
    private javax.swing.JCheckBox boiledBeansC;
    private javax.swing.JCheckBox brocoliC;
    private javax.swing.JCheckBox brownRiceC;
    private javax.swing.JCheckBox cabbageC;
    private javax.swing.JCheckBox cantaloupeC;
    private javax.swing.JCheckBox carrotC;
    private javax.swing.JCheckBox cassavaC;
    private javax.swing.JCheckBox cauliflowerC;
    private javax.swing.JCheckBox celeryC;
    private javax.swing.JCheckBox chevreC;
    private javax.swing.JCheckBox chiaC;
    private javax.swing.JCheckBox chickenC;
    private javax.swing.JCheckBox coconutC;
    private javax.swing.JCheckBox cookedSoyC;
    private javax.swing.JCheckBox cornC;
    private javax.swing.JCheckBox couscousC;
    private javax.swing.JCheckBox creamCheeseC;
    private javax.swing.JCheckBox creamyDressingC;
    private javax.swing.JCheckBox cucumberC;
    private javax.swing.JCheckBox diaryC;
    private javax.swing.JCheckBox edamameC;
    private javax.swing.JCheckBox eggC;
    private javax.swing.JCheckBox eggplantC;
    private javax.swing.JCheckBox figC;
    private javax.swing.JCheckBox garbanzoC;
    private javax.swing.JCheckBox granolaBarC;
    private javax.swing.JCheckBox grapeC;
    private javax.swing.JCheckBox greenBeansC;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JCheckBox kiwiC;
    private javax.swing.JCheckBox leekC;
    private javax.swing.JCheckBox lentilC;
    private javax.swing.JCheckBox limaBeansC;
    private javax.swing.JCheckBox linseedC;
    private javax.swing.JCheckBox mandarinC;
    private javax.swing.JCheckBox mangoC;
    private javax.swing.JCheckBox menestraC;
    private javax.swing.JCheckBox milkC;
    private javax.swing.JCheckBox mozzarellaC;
    private javax.swing.JCheckBox muesliC;
    private javax.swing.JCheckBox mushroomC;
    private javax.swing.JCheckBox nutsC;
    private javax.swing.JCheckBox oatmealC;
    private javax.swing.JCheckBox oatsC;
    private javax.swing.JCheckBox oliveOilC;
    private javax.swing.JCheckBox olivesC;
    private javax.swing.JCheckBox onionC;
    private javax.swing.JCheckBox orangeC;
    private javax.swing.JCheckBox papayaC;
    private javax.swing.JCheckBox parmesanC;
    private javax.swing.JCheckBox peachC;
    private javax.swing.JCheckBox peanutButterC;
    private javax.swing.JCheckBox pearC;
    private javax.swing.JCheckBox peasC;
    private javax.swing.JCheckBox pepperC;
    private javax.swing.JCheckBox picklesC;
    private javax.swing.JCheckBox pineappleC;
    private javax.swing.JCheckBox plantainC;
    private javax.swing.JCheckBox porkC;
    private javax.swing.JCheckBox potatoC;
    private javax.swing.JCheckBox quinoa;
    private javax.swing.JCheckBox radishC;
    private javax.swing.JCheckBox raisinC;
    private javax.swing.JTable recipeTable;
    private javax.swing.JCheckBox salmonC;
    private javax.swing.JCheckBox saltCrackersC;
    private javax.swing.JCheckBox sesameSeedsC;
    private javax.swing.JCheckBox shrimpC;
    private javax.swing.JCheckBox soySproutsC;
    private javax.swing.JCheckBox spinachC;
    private javax.swing.JCheckBox strawberryC;
    private javax.swing.JButton submit;
    private javax.swing.JCheckBox sweetPotatoC;
    private javax.swing.JCheckBox tomatoC;
    private javax.swing.JCheckBox tortillaC;
    private javax.swing.JCheckBox tunaC;
    private javax.swing.JCheckBox turkeyC;
    private javax.swing.JCheckBox turkeyHamC;
    private javax.swing.JCheckBox turnipC;
    private javax.swing.JCheckBox veganC;
    private javax.swing.JCheckBox vegetarianC;
    private javax.swing.JCheckBox watermelonC;
    private javax.swing.JCheckBox wholeWheatBreadC;
    private javax.swing.JCheckBox wildRiceC;
    private javax.swing.JCheckBox yogurtC;
    private javax.swing.JCheckBox zucciniC;
    // End of variables declaration
}
