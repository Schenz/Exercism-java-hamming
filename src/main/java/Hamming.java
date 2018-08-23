class Hamming {

    private String leftStrand;
    private String rightStrand;
    private int hammingDistance;

    Hamming(String leftStrand, String rightStrand) {
        if (leftStrand.length() != rightStrand.length()) {
            throw new IllegalArgumentException("leftStrand and rightStrand must be of equal length.");
        }

        this.leftStrand = leftStrand;
        this.rightStrand = rightStrand;

        int distance = 0;

        for (int index1 = 0; index1 < this.leftStrand.length(); index1++) {
            if (this.leftStrand.charAt(index1) != this.rightStrand.charAt(index1)) {
                distance++;
            }
        }

        this.hammingDistance = distance;
    }

    int getHammingDistance() {
        return this.hammingDistance;
    }

}
