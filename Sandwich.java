public class Sandwich {
    private Ingredient[] selectedIngredients;
    private int currSize = 0;
    
    public Sandwich(int maxIngredients) {
        this.selectedIngredients = new Ingredient[maxIngredients];
    }
    
    public void addIngredient(Ingredient ingredient) {
        if (currSize < selectedIngredients.length) {
            selectedIngredients[currSize] = ingredient;
            currSize++;
        }
    }
    
    @Override
    public String toString() {
        String result = "Sandwich: ";
        for(int i = 0; i < currSize; i++) {
            result += selectedIngredients[i].getName();
            if(i < currSize - 1){
                result += ", ";
            }
        }
        return result;
    }
}