package exercise2;
import java.util.Arrays;

        class Colors {

            String[] colorful(String[] strings) {
                String[] existingArray = {"bluebird", "red herring", "yellow bumblebee", "black spider", "green monkey", "pink", "great gatsby", "feeding frenzy", "black bird", "widowmaker", "quran", "bible", "torah"};

                for (int i = 0; i < existingArray.length; i++) {
                    if (Arrays.asList(existingArray).contains("blue")) {
                        return new String[i];
                    }
                    if (Arrays.asList(existingArray).contains("green")) {
                        return new String[i];
                    }
                    if (Arrays.asList(existingArray).contains("red")) {
                        return new String[i];
                    }
                    if (Arrays.asList(existingArray).contains("yellow")) {
                        return new String[i];
                    }
                    if (Arrays.asList(existingArray).contains("pink")) {
                        return new String[i];
                    }
                    if (Arrays.asList(existingArray).contains("black")) {
                        return new String[i];
                    } else {
                        return null;
                    }
                }
                return colorful(new String[]{});

            }
        }