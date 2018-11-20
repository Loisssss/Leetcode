    // Complete the stepPerms function below.
    static int stepPerms(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else if (n == 2){
            return 2;
        } else if (n == 3) {
            return 4;
        } else {
            return stepPerms(n-1) + stepPerms(n-2) + stepPerms(n-3);
        }
    }
