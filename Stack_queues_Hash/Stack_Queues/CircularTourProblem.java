class PetrolPump {
    int petrol;
    int distance;

    PetrolPump(int p, int d) {
        petrol = p;
        distance = d;
    }
}

public class CircularTourProblem {
    public static int findStartingPoint(PetrolPump[] arr, int n) {
        int start = 0, deficit = 0, balance = 0;
        for (int i = 0; i < n; i++) {
            balance += arr[i].petrol - arr[i].distance;
            if (balance < 0) {
                start = i + 1;
                deficit += balance;
                balance = 0;
            }
        }
        return (balance + deficit >= 0) ? start : -1;
    }
}
