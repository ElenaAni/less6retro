package db.model;

public class Products {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column products.id
     *
     * @mbg.generated Thu Jul 15 21:09:12 MSK 2021
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column products.title
     *
     * @mbg.generated Thu Jul 15 21:09:12 MSK 2021
     */
    private String title;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column products.price
     *
     * @mbg.generated Thu Jul 15 21:09:12 MSK 2021
     */
    private Integer price;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column products.category_id
     *
     * @mbg.generated Thu Jul 15 21:09:12 MSK 2021
     */
    private Long category_id;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column products.id
     *
     * @return the value of products.id
     *
     * @mbg.generated Thu Jul 15 21:09:12 MSK 2021
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column products.id
     *
     * @param id the value for products.id
     *
     * @mbg.generated Thu Jul 15 21:09:12 MSK 2021
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column products.title
     *
     * @return the value of products.title
     *
     * @mbg.generated Thu Jul 15 21:09:12 MSK 2021
     */
    public String getTitle() {
        return title;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column products.title
     *
     * @param title the value for products.title
     *
     * @mbg.generated Thu Jul 15 21:09:12 MSK 2021
     */
    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column products.price
     *
     * @return the value of products.price
     *
     * @mbg.generated Thu Jul 15 21:09:12 MSK 2021
     */
    public Integer getPrice() {
        return price;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column products.price
     *
     * @param price the value for products.price
     *
     * @mbg.generated Thu Jul 15 21:09:12 MSK 2021
     */
    public void setPrice(Integer price) {
        this.price = price;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column products.category_id
     *
     * @return the value of products.category_id
     *
     * @mbg.generated Thu Jul 15 21:09:12 MSK 2021
     */
    public Long getCategory_id() {
        return category_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column products.category_id
     *
     * @param category_id the value for products.category_id
     *
     * @mbg.generated Thu Jul 15 21:09:12 MSK 2021
     */
    public void setCategory_id(Long category_id) {
        this.category_id = category_id;
    }
}
