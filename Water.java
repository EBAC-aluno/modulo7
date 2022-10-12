public class Water {

  private String color;
  private boolean isSmelling;
  private boolean isTasting;
  private boolean isPure;
  private float temperature;
  private float volume;
  private float ph;
  private float viscosity;
  private float conductivity;
  private String matterState;

  public Water() {
    System.out.println(
        "I'm the water. I can save, but I can kill too. Also, I can hydratates, wet, clean, extinguish fire and flow.");
  }

  public void flow(){

  }

  public void hydratates() {
  }

  public void wet() {
  }

  public void clean() {
  }

  public void extinguishFire() {
  }

  public boolean canSink(float density) {
    return density > 1.0f;
  }

  public boolean canFloat(float density) {
    return density < 1.0f;
  }

  public String getColor() {
    return color;
  }

  public boolean isSmelling() {
    return isSmelling;
  }

  public boolean isTasting() {
    return isTasting;
  }

  public boolean isPure() {
    return isPure;
  }

  public float getTemperature() {
    return temperature;
  }

  public float getVolume() {
    return volume;
  }

  public float getPh() {
    return ph;
  }

  public float getViscosity() {
    return viscosity;
  }

  public float getConductivity() {
    return conductivity;
  }

  public String getMatterState() {
    return matterState;
  }
}
