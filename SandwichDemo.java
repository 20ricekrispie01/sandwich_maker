public class SandwichDemo
{
    public static void main(String[] args) {
        IngredientCategory bread = new IngredientCategory("Bread", new Ingredient[] {new Ingredient("Whole Wheat"), new Ingredient("Rye"), 
            new Ingredient("Sourdough"), new Ingredient("Multigrain"), new Ingredient("Ciabatta"), new Ingredient("Baguette"),
            new Ingredient("Pita Bread"), new Ingredient("Focaccia"), new Ingredient("Challah"), new Ingredient("Brioche"), 
            new Ingredient("English Muffin"), new Ingredient("Tortilla"), new Ingredient("Naan")});
        IngredientCategory protein = new IngredientCategory("Protein", new Ingredient[] {new Ingredient("Tuna"), new Ingredient("Salmon"),
            new Ingredient("Shrimp"), new Ingredient("Tilapia"), new Ingredient("Cod"), new Ingredient("Egg"), new Ingredient("Cottage Cheese"),
            new Ingredient("Greek Yogurt"), new Ingredient("Tofu"), new Ingredient("Tempeh"), new Ingredient("Seitan"), new Ingredient("Edamame"),
            new Ingredient("Chickpea"), new Ingredient("Lentil"), new Ingredient("Black Bean"), new Ingredient("Green Pea")});
        IngredientCategory cheese = new IngredientCategory("Cheese", new Ingredient[] {new Ingredient("Cheddar"), new Ingredient("Mozzarella"),
            new Ingredient("Swiss"), new Ingredient("Feta"), new Ingredient("Provolone"), new Ingredient("Brie"), new Ingredient("Gouda"), 
            new Ingredient("Camembert"), new Ingredient("Blue Cheese"), new Ingredient("Monterey Jack"), new Ingredient("Colby"), 
            new Ingredient("Parmesan"), new Ingredient("Ricotta"), new Ingredient("Mascarpone"), new Ingredient("Havarti"), 
            new Ingredient("Goat Cheese"), new Ingredient("Pepper Jack"), new Ingredient("Asiago"), new Ingredient("Munster"), 
            new Ingredient("Fontina")});
        IngredientCategory veggies = new IngredientCategory("Vegetables", new Ingredient[] {new Ingredient("Lettuce"), new Ingredient("Tomato"),
            new Ingredient("Cucumber"), new Ingredient("Red Onion"), new Ingredient("Spinach"), new Ingredient("Avocado"),
            new Ingredient("Bell Peppers"), new Ingredient("Jalapeño Peppers"), new Ingredient("Pickles"), new Ingredient("Olives"),
            new Ingredient("Carrots"), new Ingredient("Radish"), new Ingredient("Alfafa Sprout"), new Ingredient("Beetroot"),
            new Ingredient("Artichoke Heart"), new Ingredient("Sun-dried Tomato"), new Ingredient ("Arugula"), new Ingredient("Kale"),
            new Ingredient("Zucchini"), new Ingredient("Eggplant")});
        IngredientCategory sauce = new IngredientCategory("Sauce", new Ingredient[] {new Ingredient("Sriracha Sauce"),
            new Ingredient("Maple Syrup"), new Ingredient("Peanut Butter"), new Ingredient("Honey"), new Ingredient("Fig Jam"),
            new Ingredient("BBQ Sauce"), new Ingredient("Mayonnaise"), new Ingredient("Mustard"), new Ingredient("Aioli")});
        IngredientCategory extra = new IngredientCategory("Extra Toppings", new Ingredient[] {new Ingredient("Popcorn"),
            new Ingredient("Potato Chips"), new Ingredient("Pretzels"), new Ingredient("Pickled Ginger"), new Ingredient("Wasabi Pea"),
            new Ingredient("Ramen Noodle"), new Ingredient("Dried Cranberries"), new Ingredient("Apple Slices"), new Ingredient("Seaweed"),
            new Ingredient("Coconut Flakes"), new Ingredient("Candied Pecan"), new Ingredient("Candied Walnut"), new Ingredient("Marshmallow"),
            new Ingredient("Crushed Nachos"), new Ingredient("Olive Tapenade"), new Ingredient("Grilled Pineapple")});
            
        Sandwich sandwich = new Sandwich(6);
        sandwich.addIngredient(bread.getRandomIngredient());
        sandwich.addIngredient(protein.getRandomIngredient());
        sandwich.addIngredient(cheese.getRandomIngredient());
        sandwich.addIngredient(veggies.getRandomIngredient());
        sandwich.addIngredient(sauce.getRandomIngredient());
        sandwich.addIngredient(extra.getRandomIngredient());
        
        System.out.println("Your sandwich for today is: \n" + sandwich);
    }
}
