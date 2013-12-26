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
 * The entity of user as TABLE. <br />
 * <pre>
 * [primary-key]
 *     id
 * 
 * [column]
 *     id, username, password, email, create_at
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
 *     
 * 
 * [referrer table]
 *     relationship, tweet
 * 
 * [foreign property]
 *     
 * 
 * [referrer property]
 *     relationshipByFollowIdList, relationshipByFollowedIdList, tweetList
 * 
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Integer id = entity.getId();
 * String username = entity.getUsername();
 * String password = entity.getPassword();
 * String email = entity.getEmail();
 * java.sql.Timestamp createAt = entity.getCreateAt();
 * entity.setId(id);
 * entity.setUsername(username);
 * entity.setPassword(password);
 * entity.setEmail(email);
 * entity.setCreateAt(createAt);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsUser implements Entity, Serializable, Cloneable {

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

    /** username: {NotNull, CHAR(50)} */
    protected String _username;

    /** password: {NotNull, CHAR(255)} */
    protected String _password;

    /** email: {NotNull, CHAR(100)} */
    protected String _email;

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
        return "user";
    }

    /**
     * {@inheritDoc}
     */
    public String getTablePropertyName() { // according to Java Beans rule
        return "user";
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
    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    /** relationship by follow_id, named 'relationshipByFollowIdList'. */
    protected List<Relationship> _relationshipByFollowIdList;

    /**
     * relationship by follow_id, named 'relationshipByFollowIdList'.
     * @return The entity list of referrer property 'relationshipByFollowIdList'. (NotNull: even if no loading, returns empty list)
     */
    public List<Relationship> getRelationshipByFollowIdList() {
        if (_relationshipByFollowIdList == null) { _relationshipByFollowIdList = newReferrerList(); }
        return _relationshipByFollowIdList;
    }

    /**
     * relationship by follow_id, named 'relationshipByFollowIdList'.
     * @param relationshipByFollowIdList The entity list of referrer property 'relationshipByFollowIdList'. (NullAllowed)
     */
    public void setRelationshipByFollowIdList(List<Relationship> relationshipByFollowIdList) {
        _relationshipByFollowIdList = relationshipByFollowIdList;
    }

    /** relationship by followed_id, named 'relationshipByFollowedIdList'. */
    protected List<Relationship> _relationshipByFollowedIdList;

    /**
     * relationship by followed_id, named 'relationshipByFollowedIdList'.
     * @return The entity list of referrer property 'relationshipByFollowedIdList'. (NotNull: even if no loading, returns empty list)
     */
    public List<Relationship> getRelationshipByFollowedIdList() {
        if (_relationshipByFollowedIdList == null) { _relationshipByFollowedIdList = newReferrerList(); }
        return _relationshipByFollowedIdList;
    }

    /**
     * relationship by followed_id, named 'relationshipByFollowedIdList'.
     * @param relationshipByFollowedIdList The entity list of referrer property 'relationshipByFollowedIdList'. (NullAllowed)
     */
    public void setRelationshipByFollowedIdList(List<Relationship> relationshipByFollowedIdList) {
        _relationshipByFollowedIdList = relationshipByFollowedIdList;
    }

    /** tweet by user_id, named 'tweetList'. */
    protected List<Tweet> _tweetList;

    /**
     * tweet by user_id, named 'tweetList'.
     * @return The entity list of referrer property 'tweetList'. (NotNull: even if no loading, returns empty list)
     */
    public List<Tweet> getTweetList() {
        if (_tweetList == null) { _tweetList = newReferrerList(); }
        return _tweetList;
    }

    /**
     * tweet by user_id, named 'tweetList'.
     * @param tweetList The entity list of referrer property 'tweetList'. (NullAllowed)
     */
    public void setTweetList(List<Tweet> tweetList) {
        _tweetList = tweetList;
    }

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
        if (other == null || !(other instanceof BsUser)) { return false; }
        BsUser otherEntity = (BsUser)other;
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
        if (_relationshipByFollowIdList != null) { for (Entity e : _relationshipByFollowIdList)
        { if (e != null) { sb.append(l).append(xbRDS(e, "relationshipByFollowIdList")); } } }
        if (_relationshipByFollowedIdList != null) { for (Entity e : _relationshipByFollowedIdList)
        { if (e != null) { sb.append(l).append(xbRDS(e, "relationshipByFollowedIdList")); } } }
        if (_tweetList != null) { for (Entity e : _tweetList)
        { if (e != null) { sb.append(l).append(xbRDS(e, "tweetList")); } } }
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
        sb.append(delimiter).append(getUsername());
        sb.append(delimiter).append(getPassword());
        sb.append(delimiter).append(getEmail());
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
        if (_relationshipByFollowIdList != null && !_relationshipByFollowIdList.isEmpty())
        { sb.append(c).append("relationshipByFollowIdList"); }
        if (_relationshipByFollowedIdList != null && !_relationshipByFollowedIdList.isEmpty())
        { sb.append(c).append("relationshipByFollowedIdList"); }
        if (_tweetList != null && !_tweetList.isEmpty())
        { sb.append(c).append("tweetList"); }
        if (sb.length() > c.length()) {
            sb.delete(0, c.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    /**
     * Clone entity instance using super.clone(). (shallow copy) 
     * @return The cloned instance of this entity. (NotNull)
     */
    public User clone() {
        try {
            return (User)super.clone();
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
     * [get] username: {NotNull, CHAR(50)} <br />
     * @return The value of the column 'username'. (basically NotNull if selected: for the constraint)
     */
    public String getUsername() {
        return _username;
    }

    /**
     * [set] username: {NotNull, CHAR(50)} <br />
     * @param username The value of the column 'username'. (basically NotNull if update: for the constraint)
     */
    public void setUsername(String username) {
        __modifiedProperties.addPropertyName("username");
        this._username = username;
    }

    /**
     * [get] password: {NotNull, CHAR(255)} <br />
     * @return The value of the column 'password'. (basically NotNull if selected: for the constraint)
     */
    public String getPassword() {
        return _password;
    }

    /**
     * [set] password: {NotNull, CHAR(255)} <br />
     * @param password The value of the column 'password'. (basically NotNull if update: for the constraint)
     */
    public void setPassword(String password) {
        __modifiedProperties.addPropertyName("password");
        this._password = password;
    }

    /**
     * [get] email: {NotNull, CHAR(100)} <br />
     * @return The value of the column 'email'. (basically NotNull if selected: for the constraint)
     */
    public String getEmail() {
        return _email;
    }

    /**
     * [set] email: {NotNull, CHAR(100)} <br />
     * @param email The value of the column 'email'. (basically NotNull if update: for the constraint)
     */
    public void setEmail(String email) {
        __modifiedProperties.addPropertyName("email");
        this._email = email;
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
