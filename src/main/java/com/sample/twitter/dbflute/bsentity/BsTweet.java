package com.sample.twitter.dbflute.bsentity;

import java.io.Serializable;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;

import org.seasar.dbflute.dbmeta.DBMeta;
import org.seasar.dbflute.Entity;
import com.sample.twitter.dbflute.allcommon.DBMetaInstanceHandler;
import com.sample.twitter.dbflute.exentity.*;

/**
 * The entity of tweet as TABLE. <br />
 * <pre>
 * [primary-key]
 *     id
 * 
 * [column]
 *     id, user_id, tweet, create_at
 * 
 * [sequence]
 *     
 * 
 * [identity]
 *     id
 * 
 * [version-no]
 *     
 * 
 * [foreign table]
 *     user
 * 
 * [referrer table]
 *     
 * 
 * [foreign property]
 *     user
 * 
 * [referrer property]
 *     
 * 
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Integer id = entity.getId();
 * Integer userId = entity.getUserId();
 * String tweet = entity.getTweet();
 * java.sql.Timestamp createAt = entity.getCreateAt();
 * entity.setId(id);
 * entity.setUserId(userId);
 * entity.setTweet(tweet);
 * entity.setCreateAt(createAt);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsTweet implements Entity, Serializable, Cloneable {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** Serial version UID. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    // -----------------------------------------------------
    //                                                Column
    //                                                ------
    /** id: {PK, ID, NotNull, INT UNSIGNED(10)} */
    protected Integer _id;

    /** user_id: {IX, NotNull, INT UNSIGNED(10), FK to user} */
    protected Integer _userId;

    /** tweet: {NotNull, CHAR(140)} */
    protected String _tweet;

    /** create_at: {NotNull, TIMESTAMP(19), default=[CURRENT_TIMESTAMP]} */
    protected java.sql.Timestamp _createAt;

    // -----------------------------------------------------
    //                                              Internal
    //                                              --------
    /** The modified properties for this entity. (NotNull) */
    protected final EntityModifiedProperties __modifiedProperties = newModifiedProperties();

    /** Is the entity created by DBFlute select process? */
    protected boolean __createdBySelect;

    // ===================================================================================
    //                                                                          Table Name
    //                                                                          ==========
    /**
     * {@inheritDoc}
     */
    public String getTableDbName() {
        return "tweet";
    }

    /**
     * {@inheritDoc}
     */
    public String getTablePropertyName() { // according to Java Beans rule
        return "tweet";
    }

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    /**
     * {@inheritDoc}
     */
    public DBMeta getDBMeta() {
        return DBMetaInstanceHandler.findDBMeta(getTableDbName());
    }

    // ===================================================================================
    //                                                                         Primary Key
    //                                                                         ===========
    /**
     * {@inheritDoc}
     */
    public boolean hasPrimaryKeyValue() {
        if (getId() == null) { return false; }
        return true;
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    /** user by my user_id, named 'user'. */
    protected User _user;

    /**
     * user by my user_id, named 'user'.
     * @return The entity of foreign property 'user'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public User getUser() {
        return _user;
    }

    /**
     * user by my user_id, named 'user'.
     * @param user The entity of foreign property 'user'. (NullAllowed)
     */
    public void setUser(User user) {
        _user = user;
    }

    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    protected <ELEMENT> List<ELEMENT> newReferrerList() {
        return new ArrayList<ELEMENT>();
    }

    // ===================================================================================
    //                                                                 Modified Properties
    //                                                                 ===================
    /**
     * {@inheritDoc}
     */
    public Set<String> modifiedProperties() {
        return __modifiedProperties.getPropertyNames();
    }

    /**
     * {@inheritDoc}
     */
    public void clearModifiedInfo() {
        __modifiedProperties.clear();
    }

    /**
     * {@inheritDoc}
     */
    public boolean hasModification() {
        return !__modifiedProperties.isEmpty();
    }

    protected EntityModifiedProperties newModifiedProperties() {
        return new EntityModifiedProperties();
    }

    // ===================================================================================
    //                                                                     Birthplace Mark
    //                                                                     ===============
    /**
     * {@inheritDoc}
     */
    public void markAsSelect() {
        __createdBySelect = true;
    }

    /**
     * {@inheritDoc}
     */
    public boolean createdBySelect() {
        return __createdBySelect;
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    /**
     * Determine the object is equal with this. <br />
     * If primary-keys or columns of the other are same as this one, returns true.
     * @param other The other entity. (NullAllowed: if null, returns false fixedly)
     * @return Comparing result.
     */
    public boolean equals(Object other) {
        if (other == null || !(other instanceof BsTweet)) { return false; }
        BsTweet otherEntity = (BsTweet)other;
        if (!xSV(getId(), otherEntity.getId())) { return false; }
        return true;
    }
    protected boolean xSV(Object value1, Object value2) { // isSameValue()
        return InternalUtil.isSameValue(value1, value2);
    }

    /**
     * Calculate the hash-code from primary-keys or columns.
     * @return The hash-code from primary-key or columns.
     */
    public int hashCode() {
        int result = 17;
        result = xCH(result, getTableDbName());
        result = xCH(result, getId());
        return result;
    }
    protected int xCH(int result, Object value) { // calculateHashcode()
        return InternalUtil.calculateHashcode(result, value);
    }

    /**
     * {@inheritDoc}
     */
    public int instanceHash() {
        return super.hashCode();
    }

    /**
     * Convert to display string of entity's data. (no relation data)
     * @return The display string of all columns and relation existences. (NotNull)
     */
    public String toString() {
        return buildDisplayString(InternalUtil.toClassTitle(this), true, true);
    }

    /**
     * {@inheritDoc}
     */
    public String toStringWithRelation() {
        StringBuilder sb = new StringBuilder();
        sb.append(toString());
        String l = "\n  ";
        if (_user != null)
        { sb.append(l).append(xbRDS(_user, "user")); }
        return sb.toString();
    }
    protected String xbRDS(Entity e, String name) { // buildRelationDisplayString()
        return e.buildDisplayString(name, true, true);
    }

    /**
     * {@inheritDoc}
     */
    public String buildDisplayString(String name, boolean column, boolean relation) {
        StringBuilder sb = new StringBuilder();
        if (name != null) { sb.append(name).append(column || relation ? ":" : ""); }
        if (column) { sb.append(buildColumnString()); }
        if (relation) { sb.append(buildRelationString()); }
        sb.append("@").append(Integer.toHexString(hashCode()));
        return sb.toString();
    }
    protected String buildColumnString() {
        StringBuilder sb = new StringBuilder();
        String delimiter = ", ";
        sb.append(delimiter).append(getId());
        sb.append(delimiter).append(getUserId());
        sb.append(delimiter).append(getTweet());
        sb.append(delimiter).append(getCreateAt());
        if (sb.length() > delimiter.length()) {
            sb.delete(0, delimiter.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }
    protected String buildRelationString() {
        StringBuilder sb = new StringBuilder();
        String c = ",";
        if (_user != null) { sb.append(c).append("user"); }
        if (sb.length() > c.length()) {
            sb.delete(0, c.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    /**
     * Clone entity instance using super.clone(). (shallow copy) 
     * @return The cloned instance of this entity. (NotNull)
     */
    public Tweet clone() {
        try {
            return (Tweet)super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Failed to clone the entity: " + toString(), e);
        }
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] id: {PK, ID, NotNull, INT UNSIGNED(10)} <br />
     * @return The value of the column 'id'. (basically NotNull if selected: for the constraint)
     */
    public Integer getId() {
        return _id;
    }

    /**
     * [set] id: {PK, ID, NotNull, INT UNSIGNED(10)} <br />
     * @param id The value of the column 'id'. (basically NotNull if update: for the constraint)
     */
    public void setId(Integer id) {
        __modifiedProperties.addPropertyName("id");
        this._id = id;
    }

    /**
     * [get] user_id: {IX, NotNull, INT UNSIGNED(10), FK to user} <br />
     * @return The value of the column 'user_id'. (basically NotNull if selected: for the constraint)
     */
    public Integer getUserId() {
        return _userId;
    }

    /**
     * [set] user_id: {IX, NotNull, INT UNSIGNED(10), FK to user} <br />
     * @param userId The value of the column 'user_id'. (basically NotNull if update: for the constraint)
     */
    public void setUserId(Integer userId) {
        __modifiedProperties.addPropertyName("userId");
        this._userId = userId;
    }

    /**
     * [get] tweet: {NotNull, CHAR(140)} <br />
     * @return The value of the column 'tweet'. (basically NotNull if selected: for the constraint)
     */
    public String getTweet() {
        return _tweet;
    }

    /**
     * [set] tweet: {NotNull, CHAR(140)} <br />
     * @param tweet The value of the column 'tweet'. (basically NotNull if update: for the constraint)
     */
    public void setTweet(String tweet) {
        __modifiedProperties.addPropertyName("tweet");
        this._tweet = tweet;
    }

    /**
     * [get] create_at: {NotNull, TIMESTAMP(19), default=[CURRENT_TIMESTAMP]} <br />
     * @return The value of the column 'create_at'. (basically NotNull if selected: for the constraint)
     */
    public java.sql.Timestamp getCreateAt() {
        return _createAt;
    }

    /**
     * [set] create_at: {NotNull, TIMESTAMP(19), default=[CURRENT_TIMESTAMP]} <br />
     * @param createAt The value of the column 'create_at'. (basically NotNull if update: for the constraint)
     */
    public void setCreateAt(java.sql.Timestamp createAt) {
        __modifiedProperties.addPropertyName("createAt");
        this._createAt = createAt;
    }
}
