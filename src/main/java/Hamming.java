class Hamming {

    private int hammingDistance;

    Hamming(String leftStrand, String rightStrand) {
        if (leftStrand.length() != rightStrand.length()) {
            throw new IllegalArgumentException("leftStrand and rightStrand must be of equal length.");
        }

        int distance = 0;

        for (int index1 = 0; index1 < leftStrand.length(); index1++) {
            if (leftStrand.charAt(index1) != rightStrand.charAt(index1)) {
                distance++;
            }
        }

        this.hammingDistance = distance;
    }

    int getHammingDistance() {
        return this.hammingDistance;
    }

}
