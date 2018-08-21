class Hamming {

    private String leftStrand;
    private String rightStrand;

    Hamming(String leftStrand, String rightStrand) {
        if (leftStrand.length() != rightStrand.length()) {
            throw new IllegalArgumentException("leftStrand and rightStrand must be of equal length.");
        }

        this.leftStrand = leftStrand;
        this.rightStrand = rightStrand;
    }

    int getHammingDistance() {
        int distance = 0;

        for (int index1 = 0; index1 < this.leftStrand.length(); index1++) {
            if (this.leftStrand.charAt(index1) != this.rightStrand.charAt(index1)) {
                distance++;
            }
        }

        return distance;
    }

}
