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
 * The entity of relationship as TABLE. <br />
 * <pre>
 * [primary-key]
 *     id
 * 
 * [column]
 *     id, follow_id, followed_id
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
 *     userByFollowId, userByFollowedId
 * 
 * [referrer property]
 *     
 * 
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Integer id = entity.getId();
 * Integer followId = entity.getFollowId();
 * Integer followedId = entity.getFollowedId();
 * entity.setId(id);
 * entity.setFollowId(followId);
 * entity.setFollowedId(followedId);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsRelationship implements Entity, Serializable, Cloneable {

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

    /** follow_id: {UQ, NotNull, INT UNSIGNED(10), FK to user} */
    protected Integer _followId;

    /** followed_id: {UQ+, IX, NotNull, INT UNSIGNED(10), FK to user} */
    protected Integer _followedId;

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
        return "relationship";
    }

    /**
     * {@inheritDoc}
     */
    public String getTablePropertyName() { // according to Java Beans rule
        return "relationship";
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
    /** user by my follow_id, named 'userByFollowId'. */
    protected User _userByFollowId;

    /**
     * user by my follow_id, named 'userByFollowId'.
     * @return The entity of foreign property 'userByFollowId'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public User getUserByFollowId() {
        return _userByFollowId;
    }

    /**
     * user by my follow_id, named 'userByFollowId'.
     * @param userByFollowId The entity of foreign property 'userByFollowId'. (NullAllowed)
     */
    public void setUserByFollowId(User userByFollowId) {
        _userByFollowId = userByFollowId;
    }

    /** user by my followed_id, named 'userByFollowedId'. */
    protected User _userByFollowedId;

    /**
     * user by my followed_id, named 'userByFollowedId'.
     * @return The entity of foreign property 'userByFollowedId'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public User getUserByFollowedId() {
        return _userByFollowedId;
    }

    /**
     * user by my followed_id, named 'userByFollowedId'.
     * @param userByFollowedId The entity of foreign property 'userByFollowedId'. (NullAllowed)
     */
    public void setUserByFollowedId(User userByFollowedId) {
        _userByFollowedId = userByFollowedId;
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
        if (other == null || !(other instanceof BsRelationship)) { return false; }
        BsRelationship otherEntity = (BsRelationship)other;
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
        if (_userByFollowId != null)
        { sb.append(l).append(xbRDS(_userByFollowId, "userByFollowId")); }
        if (_userByFollowedId != null)
        { sb.append(l).append(xbRDS(_userByFollowedId, "userByFollowedId")); }
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
        sb.append(delimiter).append(getFollowId());
        sb.append(delimiter).append(getFollowedId());
        if (sb.length() > delimiter.length()) {
            sb.delete(0, delimiter.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }
    protected String buildRelationString() {
        StringBuilder sb = new StringBuilder();
        String c = ",";
        if (_userByFollowId != null) { sb.append(c).append("userByFollowId"); }
        if (_userByFollowedId != null) { sb.append(c).append("userByFollowedId"); }
        if (sb.length() > c.length()) {
            sb.delete(0, c.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    /**
     * Clone entity instance using super.clone(). (shallow copy) 
     * @return The cloned instance of this entity. (NotNull)
     */
    public Relationship clone() {
        try {
            return (Relationship)super.clone();
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
     * [get] follow_id: {UQ, NotNull, INT UNSIGNED(10), FK to user} <br />
     * @return The value of the column 'follow_id'. (basically NotNull if selected: for the constraint)
     */
    public Integer getFollowId() {
        return _followId;
    }

    /**
     * [set] follow_id: {UQ, NotNull, INT UNSIGNED(10), FK to user} <br />
     * @param followId The value of the column 'follow_id'. (basically NotNull if update: for the constraint)
     */
    public void setFollowId(Integer followId) {
        __modifiedProperties.addPropertyName("followId");
        this._followId = followId;
    }

    /**
     * [get] followed_id: {UQ+, IX, NotNull, INT UNSIGNED(10), FK to user} <br />
     * @return The value of the column 'followed_id'. (basically NotNull if selected: for the constraint)
     */
    public Integer getFollowedId() {
        return _followedId;
    }

    /**
     * [set] followed_id: {UQ+, IX, NotNull, INT UNSIGNED(10), FK to user} <br />
     * @param followedId The value of the column 'followed_id'. (basically NotNull if update: for the constraint)
     */
    public void setFollowedId(Integer followedId) {
        __modifiedProperties.addPropertyName("followedId");
        this._followedId = followedId;
    }
}
