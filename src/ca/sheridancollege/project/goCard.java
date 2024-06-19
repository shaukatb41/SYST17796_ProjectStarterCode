package ca.sheridancollege.project;
/**
 * @author Bushra Shaukat, 18-06-2024
 * @author Muhammad Haris, 18-06-2024
 * @author Zawar Sami, 18-06-2024
 */
import java.util.Objects;

public class goCard extends Card
{

    private String value;
    private String rank;
    

    /**
     * @param value
     * @param rank
     * @modifier Bushra Shaukat, 18-06-2024
     */
    public goCard(String value, String rank)
    {
        super();
        setRank(rank);
        setValue(value);
    }

    /**
     * @return @modifier Bushra Shaukat, 18-06-2024
     */
    public String getValue()
    {
        return value;
    }

    /**
     * @param value
     * @modifier Bushra Shaukat, 18-06-2024
     */
    public void setValue(String value)
    {
        this.value = value;
    }

    /**
     *
     * @return rank
     * @modifier Bushra Shaukat, 18-06-2024
     */
    public String getRank()
    {
        return rank;
    }

    /**
     * @param rank
     * @modifier Bushra Shaukat, 18-06-2024
     */
    public void setRank(String rank)
    {
        this.rank = rank;
    }

    /**
     * @param obj
     * @return
     * @modifier Bushra Shaukat, 18-06-2024
     */
    @Override
    public boolean equals(Object obj)
    {
        return this == obj;
    }

    /**
     *
     * @return hash
     * @modifier Bushra Shaukat, 18-06-2024
     */
    @Override
    public int hashCode()
    {
        int hash = 7;
        hash = 37 * hash + Objects.hashCode(this.value);
        hash = 37 * hash + Objects.hashCode(this.rank);
        return hash;
    }

    /**
     *
     * @return rank and value
     * @modifier Bushra Shaukat, 18-06-2024
     */
    @Override
    public String toString()
    {
        return "(" + getRank() + getValue() + ")";
    }

}