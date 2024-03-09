package com.example.healthierlifestyle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.res.TypedArray;
import android.media.Image;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import kotlin.jvm.internal.TypeParameterReference;

public class DetailsRecipes extends AppCompatActivity {

    String[] ingredientP = {"2tbsp olive oil\n4 skinless chicken breasts\n2 onions\n4 garlic gloves\n1tbsp sweet paprika\n400 ml chicken stock\n4tsp Dijon mustard\n 2tbsp Worcestershire sauce\n 200g soured cream\n a large handful of parsley\nrice mash",
            "100g bulgur wheat\n1/2 small cucumber\n100g cherry tomatoes\n25g pitted green olives\nsmall handful of parsley\n2tbsp rose harissa\n2tsp honey\n1garlic clove\n1/2 lemon\n2tbsp olive oil\n1/2 red onion\n2 boneless white fish fillets",
            "1tbsp olive oil\n1 onion\n2 red peppers\n3tbsp chipotle paste\n2 cans chopped tomatoes\n4 skinless chicken breasts\n140g quinoa\n2 chicken stock cubes\n1 can pinto beans\nsmall bunch coriander\njuice 1 lime\n1tbsp sugar\natural yogurt",
            "320g pack chicken mini breast fillets\n2 1/2tbsp light soy sauce\nvegetable oil\n1 red pepper\n1 green pepper\n3tbsp cornflour\n3tbsp sweet chilli sauce\n1 tbsp garlic paste\n1tbsp sesame oil\n2 spring onions"};
    String[] prepare = {"1.Heat half the oil in a frying pan and fry the chicken pieces over a medium high heat, stirring frequently. until golden brown. Season and transfer to a plate.\n2.Heat the remaining oil and lower the heat to medium. Fry the onion for 6-8 mins until softened but not golden, then stir in the garlic and paprika. Fry for a minute until fragrant, then pour in the stock, and add the Dijon and Worcestershire sauce. Tip in the seared chicken with any resting juices, and simmer for 5-6 mins until reduced slightly and the chicken is cooked through.\n3.Over a low heat, stir in the soured cream until just combined to create a creamy sauce, and it’s just started to simmer. Scatter over the parsley and serve with rice, mash or pasta, if you like.",
            "1.Cook the bulgur following pack instructions, then rinse and drain well before tipping into a large bowl. Add the cucumber, tomatoes, olives and most of the parsley. Season well. Combine the harissa, honey, garlic, lemon juice, half the oil and 1 tbsp water in a bowl, then set aside.\n2.Heat the remaining oil in a non-stick pan over a medium heat and cook the red onion for 4-5 mins until softened and lightly browned. Season the fish well, then add to the pan and cook for 3 mins before pouring in the harissa mixture. Turn the fish and cook for 2-4 mins more (depending on the thickness of the fish), basting the fish in the pan juices until cooked through – the flesh should be opaque.\n3.Divide the bulgur salad between two plates, top with the fish and fried onions, then drizzle over any remaining pan juices and sprinkle over the remaining parsley to serve.",
            "1.Heat the oil in a deep frying pan and fry the onions and peppers for a few mins until softened. Stir in the chipotle paste for a minute, followed by the tomatoes. Add up to a tomato can-full of water to cover the chicken and bring to a gentle simmer. Add the chicken breasts and gently simmer, turning the chicken occasionally, for 20 mins until the chicken is cooked through.\n2.Bring a large saucepan of water to the boil with the stock cubes. Add the quinoa and cook for 15 mins until tender, adding the beans for the final min. Drain well and stir in the coriander and lime juice, then check for seasoning before covering to keep warm.\n3.Lift the chicken out onto a board and shred each breast using two forks. Stir back into the tomato sauce with the sugar and season. Serve with the",
            "1.Slice the chicken into thin strips. Pour over 2 tbsp of the soy and marinate in the fridge, covered, for 1 hr.\n2.Meanwhile, heat 1 tbsp of the oil in a wok or deep frying pan over a medium heat and cook the peppers for 3-4 mins until just beginning to soften. Remove with a slotted spoon and set aside.\n3.Spread the cornflour out in a shallow bowl. Season, then add the marinated chicken strips and toss to coat well.\n4.Fill a wok or deep frying pan with the oil so it’s about ½cm deep, then heat to medium-high. Carefully add the chicken in batches, cooking for 3-4 mins, using tongs to turn regularly until golden and crispy. Remove with a slotted spoon and place on a plate lined with kitchen paper to drain."};
    TypedArray imges=null;

    String[] ingredientC={"2 Tbsp. plus 2 tsp. olive oil, divided\n1 1/4 lb. skinless salmon fillet\n1 lb. green beans\nKosher salt\n4 cloves garlic\n1 small red chile\n2 tbsp. capers\nLemon wedges",
            "1 pt. cherry tomatoes\n1/4 c. sugar\n1/2 tsp. chili powder\n3 1/2 oz. roughly torn baguette\n1 1/2 oz. finely grated Parmesan\n2 tbsp. olive oil\n2 broccoli crowns\nKosher salt",
    "2 1/2 lb. butternut squash\n2 medium carrots\n1 large onion\n4 cloves garlic\n1 Fresno chile\n4 sprigs fresh thyme\n4 tbsp. olive oil\nKosher salt\n2 tbsp. pepitas\n1/4 tsp. smoked paprika\nSour cream",
    "2 large peppers\n1 bulb fennel\n1 medium onion\n4 tbsp. olive oil\nKosher salt\n1 11/4-pound piece cod\n3 tbsp. sherry vinegar\n3 tbsp. capers\n1 tbsp. anchovy paste\n1 clove garlic, grated\n1/2 c. flat-leaf parsley"};

    String[] prepareC={"1.Heat 2 teaspoons oil in a large skillet on medium-high. Season salmon with ½ teaspoon each salt and pepper, add to skillet, flesh side down, reduce heat to medium, and cook until golden brown and just opaque throughout, 5 to 6 minutes per side.\n2.Heat remaining 2 tablespoons oil in a large cast-iron skillet on medium-high. Add green beans and cook until browned, 2½ minutes. Turn with tongs and cook until browned and just barely tender, about 3 minutes more.\n3.Remove from heat and toss with ¼ teaspoon salt, then garlic, chile, and capers. Return to medium heat and cook, tossing until garlic is golden brown, 1 to 2 minutes. Serve with salmon and lemon wedges if desired.",
    "1.Heat oven to 425°F. In a small saucepan, simmer tomatoes, sugar, chili powder and 1/2 cup water until completely broken down and glossy, 20 to 25 minutes.\n2.In a food processor, pulse bread with Parmesan to form coarse crumbs. Spread on a rimmed baking sheet and toast in oven until golden brown, 4 to 5 minutes.\n3.Meanwhile, heat a large cast-iron skillet on medium-high. Add oil, then broccoli crowns, cut sides down, and cook until golden brown, 5 to 6 minutes. Flip broccoli, season with 1/2 teaspoon each salt and pepper, transfer to oven and roast until just tender, about 16 minutes. Serve broccoli steak with tomato jam and crumbs.",
    "1.In large bowl, toss squash, carrots, onion, whole garlic cloves, chile, thyme, 2 tablespoons oil and 3/4 teaspoon salt. Transfer to air-fryer basket and air-fry at 400°F, shaking basket occasionally, until vegetables are tender, 30 minutes. Discard thyme sprigs.\n2.Meanwhile, in small skillet on medium, cook sliced garlic in remaining 2 tablespoons oil, stirring, until garlic begins to lightly brown around the edges, 2 minutes. Add pepitas and paprika and a pinch of salt and cook 1 minute; transfer to a bowl.\n3.Transfer all but 1/2 cup squash to blender, add 1 cup water and puree, gradually adding 3 more cups water, pureeing until smooth. Reheat if necessary and serve topped with sour cream and spiced pepitas and with crusty bread if desired. Serve topped with remaining squash.",
    "1.Heat oven to 450°F. On large rimmed baking sheet, toss peppers, fennel, and onion with 2 tablespoons oil and 1/2 teaspoon each salt and pepper. Roast 15 minutes.\n2.Reduce oven temp to 425°F; toss vegetables, then nestle fish among them. Season with 1/4 teaspoon each salt and pepper and continue roasting until cod is opaque throughout, 10 to 12 minutes more.\n3.Meanwhile, in small bowl, combine vinegar, capers, anchovy paste, garlic, remaining 2 tablespoons oil, and 1/4 teaspoon salt; stir in parsley. Serve spooned over fish."};

    TypedArray imgesC=null;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details_recipes);

        Intent intent = getIntent();
        String title = intent.getStringExtra("title");
        Log.d("TitleDebug","Title received: "+title);

        String ingText = "";
        String prepText = "";
        imges=getResources().obtainTypedArray(R.array.images);
        imgesC=getResources().obtainTypedArray(R.array.imagesc);
        int imageResourceId=0;


    if(title!=null && title.equals("Chicken stroganoff")){
        imageResourceId=imges.getResourceId(0,-1);
        ingText=ingredientP[0];
        prepText=prepare[0];
    } else if(title!=null && title.equals("Harissa fish with bulgur salad")){
        imageResourceId=imges.getResourceId(1,-1);
        ingText=ingredientP[1];
        prepText=prepare[1];
    } else if(title!=null && title.equals("Mexican chicken stew with quinoa and beans")){
        imageResourceId=imges.getResourceId(2,-1);
        ingText=ingredientP[2];
        prepText=prepare[2];
    } else if(title!=null && title.equals("Crispy shredded chicken")){
        imageResourceId=imges.getResourceId(3,-1);
        ingText=ingredientP[3];
        prepText=prepare[3];
    } else if(title!=null && title.equals("Seared salmon with charred green beans")){
        imageResourceId=imgesC.getResourceId(0,-1);
        ingText=ingredientC[0];
        prepText=prepareC[0];
    } else if(title!=null && title.equals("Broccoli steaks with spicy tomato jam")){
        imageResourceId=imgesC.getResourceId(1,-1);
        ingText=ingredientC[1];
        prepText=prepareC[1];
    } else if(title!=null && title.equals("Air fryer squash soup")){
        imageResourceId=imgesC.getResourceId(2,-1);
        ingText=ingredientC[2];
        prepText=prepareC[2];
    } else if(title!=null && title.equals("Sheet pan fish and vegetables")){
        imageResourceId=imgesC.getResourceId(3,-1);
        ingText=ingredientC[3];
        prepText=prepareC[3];
    }


        ImageView img=(ImageView) findViewById(R.id.recipeImage);
        img.setImageResource(imageResourceId);
        TextView tit = (TextView) findViewById(R.id.recipeTitle);
        tit.setText(title);
        TextView ing = (TextView) findViewById(R.id.ingAll);
        ing.setText(ingText);
        TextView desc = (TextView) findViewById(R.id.recipePreparation);
        desc.setText(prepText);

    }
}