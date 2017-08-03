package leaderboardInvite;

public class User {

    private String Citizenship;

    private int Rank;

    private String LinkedIn;

    private String Country;

    private int ZipCode;

    private String City;

    private String Eligibility;

    private String Notes;

    private String Name;

    private String Professional;

    private String Experience;

    private String Graduation;

    private String Email;

    private String Resume;

    private String Gender;

    private int Score;

    private String School;

    public String getCitizenship ()
    {
        return Citizenship;
    }

    public void setCitizenship (String Citizenship)
    {
        this.Citizenship = Citizenship;
    }

    public int getRank ()
    {
        return Rank;
    }

    public void setRank (int Rank)
    {
        this.Rank = Rank;
    }

    public String getLinkedIn ()
    {
        return LinkedIn;
    }

    public void setLinkedIn (String LinkedIn)
    {
        this.LinkedIn = LinkedIn;
    }

    public String getCountry ()
    {
        return Country;
    }

    public void setCountry (String Country)
    {
        this.Country = Country;
    }

    public int getZipCode ()
    {
        return ZipCode;
    }

    public void setZipCode (int ZipCode)
    {
        this.ZipCode = ZipCode;
    }

    public String getCity ()
    {
        return City;
    }

    public void setCity (String City)
    {
        this.City = City;
    }

    public String getEligibility ()
    {
        return Eligibility;
    }

    public void setEligibility (String Eligibility)
    {
        this.Eligibility = Eligibility;
    }

    public String getNotes ()
    {
        return Notes;
    }

    public void setNotes (String Notes)
    {
        this.Notes = Notes;
    }

    public String getName ()
    {
        return Name;
    }

    public void setName (String Name)
    {
        this.Name = Name;
    }

    public String getProfessional ()
    {
        return Professional;
    }

    public void setProfessional (String Professional)
    {
        this.Professional = Professional;
    }

    public String getExperience ()
    {
        return Experience;
    }

    public void setExperience (String Experience)
    {
        this.Experience = Experience;
    }

    public String getGraduation ()
    {
        return Graduation;
    }

    public void setGraduation (String Graduation)
    {
        this.Graduation = Graduation;
    }

    public String getEmail ()
    {
        return Email;
    }

    public void setEmail (String Email)
    {
        this.Email = Email;
    }

    public String getResume ()
    {
        return Resume;
    }

    public void setResume (String Resume)
    {
        this.Resume = Resume;
    }

    public String getGender ()
    {
        return Gender;
    }

    public void setGender (String Gender)
    {
        this.Gender = Gender;
    }

    public int getScore ()
    {
        return Score;
    }

    public void setScore (int Score)
    {
        this.Score = Score;
    }

    public String getSchool ()
    {
        return School;
    }

    public void setSchool (String School)
    {
        this.School = School;
    }

    @Override
    public String toString()
    {
        return "[Citizenship = "+Citizenship+", Rank = "+Rank+", LinkedIn = "+LinkedIn+", Country = "+Country+", ZipCode = "+ZipCode+", City = "+City+", Eligibility = "+Eligibility+", Notes = "+Notes+", Name = "+Name+", Professional = "+Professional+", Experience = "+Experience+", Graduation = "+Graduation+", Email = "+Email+", Resume = "+Resume+", Gender = "+Gender+", Score = "+Score+", School = "+School+"]";
    }
}