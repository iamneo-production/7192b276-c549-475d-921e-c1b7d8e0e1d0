package model;


import javax.persistence.*;

@Entity
@Table(name = "bank_details")
public class BankValutModel {

    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    @Column(name = "bank_id")
    private Long id;
    private String valutId;
    private String userID;
    private Long accountNumber;
    private String accountName;
    private String IFSC;
    private String userName;
    private String password;



    // @ManyToOne(cascade = CascadeType.ALL ,fetch = FetchType.LAZY)
    // private  UserModel user;

     
    public BankValutModel() {
    }

    public BankValutModel(Long id, String valutId, String userID, Long accountNumber, String accountName, String IFSC, String userName, String password) {
        this.id = id;
        this.valutId = valutId;
        this.userID = userID;
        this.accountNumber = accountNumber;
        this.accountName = accountName;
        this.IFSC = IFSC;
        this.userName = userName;
        this.password = password;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getValutId() {
        return valutId;
    }

    public void setValutId(String valutId) {
        this.valutId = valutId;
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public Long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(Long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getIFSC() {
        return IFSC;
    }

    public void setIFSC(String IFSC) {
        this.IFSC = IFSC;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
