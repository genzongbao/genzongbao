package ydh.weixin.entity;
// Generated 2017-2-13 16:19:34 by Hibernate Tools 4.0.1.Final

/**
 * Weixin generated by hbm2java
 */
public class Weixin implements java.io.Serializable {

    private long userId;
    private String gzbOpenid;
    private String hfsOpenid;
    private int gzbAccept;

    public Weixin() {
    }

    public Weixin(long userId) {
        this.userId = userId;
    }

    public Weixin(long userId, String gzbOpenid, String hfsOpenid) {
        this.userId = userId;
        this.gzbOpenid = gzbOpenid;
        this.hfsOpenid = hfsOpenid;
    }

    public long getUserId() {
        return this.userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public String getGzbOpenid() {
        return this.gzbOpenid;
    }

    public void setGzbOpenid(String gzbOpenid) {
        this.gzbOpenid = gzbOpenid;
    }

    public String getHfsOpenid() {
        return this.hfsOpenid;
    }

    public void setHfsOpenid(String hfsOpenid) {
        this.hfsOpenid = hfsOpenid;
    }

    public int getGzbAccept() {
        return gzbAccept;
    }

    public void setGzbAccept(int gzbAccept) {
        this.gzbAccept = gzbAccept;
    }
}
