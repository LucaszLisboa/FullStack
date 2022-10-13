package dev.lucas.AppRegions.geography.domain;

public class City {
    @org.springframework.data.annotation.Id
    private String Id;
    private String cityName;
    private String cityUF;
    private String cityRegion;
    private String cityShortDescription;
    private String cityDescription;
    private String cityImage;
    private String cityPopulation;
    private String cityAltitude;
    private String cityArea;
    private String cityMayor;

    public City() {
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getCityUF() {
        return cityUF;
    }

    public void setCityUF(String cityUF) {
        this.cityUF = cityUF;
    }

    public String getCityRegion() {
        return cityRegion;
    }

    public void setCityRegion(String cityRegion) {
        this.cityRegion = cityRegion;
    }

    public String getCityShortDescription() {
        return cityShortDescription;
    }

    public void setCityShortDescription(String cityShortDescription) {
        this.cityShortDescription = cityShortDescription;
    }

    public String getCityDescription() {
        return cityDescription;
    }

    public void setCityDescription(String cityDescription) {
        this.cityDescription = cityDescription;
    }

    public String getCityImage() {
        return cityImage;
    }

    public void setCityImage(String cityImage) {
        this.cityImage = cityImage;
    }

    public String getCityPopulation() {
        return cityPopulation;
    }

    public void setCityPopulation(String cityPopulation) {
        this.cityPopulation = cityPopulation;
    }

    public String getCityAltitude() {
        return cityAltitude;
    }

    public void setCityAltitude(String cityAltitude) {
        this.cityAltitude = cityAltitude;
    }

    public String getCityArea() {
        return cityArea;
    }

    public void setCityArea(String cityArea) {
        this.cityArea = cityArea;
    }

    public String getCityMayor() {
        return cityMayor;
    }

    public void setCityMayor(String cityMayor) {
        this.cityMayor = cityMayor;
    }
}
