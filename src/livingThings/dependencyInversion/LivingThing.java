package livingThings.dependencyInversion;

public class LivingThing {

    CharacteristicsOfLivingThings characteristicsOfLivingThings;

    public LivingThing(CharacteristicsOfLivingThings characteristicsOfLivingThings){
        characteristicsOfLivingThings = this.characteristicsOfLivingThings;
    }

    public static void main(String[] args) {
        CharacteristicsOfLivingThings cat = new CharacteristicsOfLivingThings() {
            @Override
            public void move() {

            }

            @Override
            public void respire() {

            }

            @Override
            public void feed() {

            }

            @Override
            public void sensitive() {

            }

            @Override
            public void growth() {

            }

            @Override
            public void reproduce() {

            }

            @Override
            public void death() {

            }
        };

    }
}
