public class IngredientCategory
{
    private String name;
    private Ingredient[] ingredients;
    
    public IngredientCategory(String name, Ingredient[] ingredients){
        this.name = name;
        this.ingredients = ingredients;
    }
    
    public Ingredient getRandomIngredient() {
        int randomIndex = (int) (Math.random() * ingredients.length);
        return ingredients[randomIndex];
    }
}
