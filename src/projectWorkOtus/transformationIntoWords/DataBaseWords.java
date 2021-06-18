package projectWorkOtus.transformationIntoWords;

public interface DataBaseWords {
    public String getHundreds(long dig);

    public String getDecades(long dig);

    public String getUnits(long dig, boolean female);

    public String getTeens(long dig);

    public String getDigit(long dig);


}
