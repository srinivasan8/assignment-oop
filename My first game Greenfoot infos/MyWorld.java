import greenfoot.*;  // (World, Actor, Images, Music and ScenarioInfo)


//uses of custom-built classes and methods, along with exception handling, primitive data types, and java collections  
//apply decency uses of class, polymorphism, methods, and inheritance.          
public class MyWorld extends World
{
    public static int score= 0;
    
    
    public MyWorld() {
       
         // certain size and features on what my world will look like
        super(600, 400, 1); 

        addObject(new ball(), 300, 150);// so that you can add balls 
        
        addObject(new sprite(),300, 150); // so that you can add sprites
        prepare();
    }
     
    public void act()
    {   // use exception handling to add up the scores and bind certain keys.
        showText("Score: " + score, 50, 25);
        showText("Press r for level 2", 400,390);
        
        if(Greenfoot.isKeyDown("q"))
        Greenfoot.setWorld(new startmenu());
        if(Greenfoot.isKeyDown("r"))
        Greenfoot.setWorld(new level2());
        
    }
    
    private void prepare()
    {  // uses a variety of java collections, instance variables, and objects.
        score=0;
        sprite sprite= new sprite();
        addObject(sprite, -50, -55);
        platform platform = new platform();
        addObject(platform, 450, 400);

        sprite.setLocation(-50,-55);
        sprite.setLocation(-50,-55);
        platform.setLocation(412,246);
        platform.setLocation(415,246);
        platform.setLocation(416,235);
        platform platform2 = new platform();
        addObject(platform2,485,248);
        platform2.setLocation(502,245);
        platform2.setLocation(503,246);
        platform platform3 = new platform();
        addObject(platform3,578,241);
        platform3.setLocation(591,250);
        platform platform4 = new platform();
        addObject(platform4,57,341);
        platform4.setLocation(48,346);
        platform platform5 = new platform();
        addObject(platform5,148,344);
        platform5.setLocation(148,345);
        platform platform6 = new platform();
        addObject(platform6,239,351);
        platform6.setLocation(300,282);
        platform4.setLocation(74,391);
        platform platform7 = new platform();
        addObject(platform7,382,280);
        platform7.setLocation(404,285);
        platform2.setLocation(516,289);
        platform6.setLocation(317,276);
        platform.setLocation(273,350);
        platform platform8 = new platform();
        addObject(platform8,323,354);
        platform8.setLocation(349,344);
        platform8.setLocation(347,345);
        platform3.setLocation(412,342);
        platform4.setLocation(50,390);
        platform4.setLocation(10,377);
        platform4.setLocation(10,377);
        platform4.setLocation(10,377);
        platform3.setLocation(469,339);
        platform8.setLocation(573,343);
        platform platform9 = new platform();
        addObject(platform9,364,344);
        platform9.setLocation(364,343);
        platform9.setLocation(363,347);
        platform platform10 = new platform();
        addObject(platform10,208,343);
        platform10.setLocation(210,350);
        platform7.setLocation(439,266);
        platform2.setLocation(487,275);
        platform platform11 = new platform();
        addObject(platform11,580,277);
        platform11.setLocation(580,277);
        platform8.setLocation(553,353);
        ball ball = new ball();
        addObject(ball,497,144);
        ball.setLocation(502,158);
        removeObject(ball);
        removeObject(sprite);
        platform8.setLocation(508,344);
        platform3.setLocation(572,343);
        platform10.setLocation(214,344);
        platform7.setLocation(391,270);
        platform platform12 = new platform();
        addObject(platform12,239,271);
        platform12.setLocation(226,277);
        platform12.setLocation(226,277);
        platform platform13 = new platform();
        addObject(platform13,520,197);
        platform13.setLocation(558,206);
        platform platform14 = new platform();
        addObject(platform14,437,204);
        platform14.setLocation(452,212);
        platform platform15 = new platform();
        addObject(platform15,360,207);
        platform15.setLocation(350,210);
        platform platform16 = new platform();
        addObject(platform16,379,141);
        platform16.setLocation(406,128);
        platform platform17 = new platform();
        addObject(platform17,494,142);
        platform17.setLocation(507,134);
        platform platform18 = new platform();
        addObject(platform18,572,130);
        platform18.setLocation(583,140);
        platform18.setLocation(582,138);
        platform platform19 = new platform();
        addObject(platform19,415,348);
        platform19.setLocation(439,347);
        platform platform20 = new platform();
        addObject(platform20,353,70);
        platform platform21 = new platform();
        addObject(platform21,265,72);
        platform21.setLocation(256,69);
        platform platform22 = new platform();
        addObject(platform22,142,68);
        platform22.setLocation(168,66);
        platform platform23 = new platform();
        addObject(platform23,41,68);
        platform23.setLocation(62,72);
        platform platform24 = new platform();
        addObject(platform24,80,374);
        platform24.setLocation(93,381);
        platform24.setLocation(90,373);
        platform7.setLocation(405,272);
        platform16.setLocation(419,152);
        platform17.setLocation(485,96);
        platform18.setLocation(532,154);
        platform17.setLocation(512,92);
        ball ball2 = new ball();
        addObject(ball2,231,207);
        ball ball3 = new ball();
        addObject(ball3,427,107);
        ball ball4 = new ball();
        addObject(ball4,328,26);
        ball ball5 = new ball();
        addObject(ball5,123,291);
        spikey spikey = new spikey();
        addObject(spikey,218,306);
        spikey spikey2 = new spikey();
        addObject(spikey2,334,242);
        spikey.setLocation(201,308);
        spikey.setLocation(300,310);
        spikey2.setLocation(390,243);
        spikey spikey3 = new spikey();
        addObject(spikey3,501,239);
        spikey spikey4 = new spikey();
        addObject(spikey4,485,315);
        spikey spikey5 = new spikey();
        addObject(spikey5,509,128);
        spikey spikey6 = new spikey();
        addObject(spikey6,399,185);
        spikey6.setLocation(429,186);
        spikey6.setLocation(391,176);
        spikey6.setLocation(391,176);
        spikey6.setLocation(391,176);
        spikey6.setLocation(379,167);
        spikey6.setLocation(400,172);
        removeObject(spikey6);

        addObject(spikey6,428,181);
        ball2.setLocation(243,244);
        ball ball6 = new ball();
        addObject(ball6,172,143);
        ball ball7 = new ball();
        addObject(ball7,81,156);
        ball ball8 = new ball();
        addObject(ball8,143,219);
    }
}
