package com.sample.twitter.dbflute.cbean.cq.bs;

import java.util.Map;

import org.seasar.dbflute.cbean.*;
import org.seasar.dbflute.cbean.cvalue.ConditionValue;
import org.seasar.dbflute.cbean.sqlclause.SqlClause;
import org.seasar.dbflute.exception.IllegalConditionBeanOperationException;
import com.sample.twitter.dbflute.cbean.cq.ciq.*;
import com.sample.twitter.dbflute.cbean.*;
import com.sample.twitter.dbflute.cbean.cq.*;

/**
 * The base condition-query of user.
 * @author DBFlute(AutoGenerator)
 */
public class BsUserCQ extends AbstractBsUserCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected UserCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsUserCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(childQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br />
     * {select ... from ... left outer join (select * from user) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #FD4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public UserCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected UserCIQ xcreateCIQ() {
        UserCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected UserCIQ xnewCIQ() {
        return new UserCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br />
     * {select ... from ... left outer join user on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #FD4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public UserCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        UserCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====

    protected ConditionValue _id;
    public ConditionValue getId() {
        if (_id == null) { _id = nCV(); }
        return _id;
    }
    protected ConditionValue getCValueId() { return getId(); }

    protected Map<String, RelationshipCQ> _id_ExistsReferrer_RelationshipByFollowIdListMap;
    public Map<String, RelationshipCQ> getId_ExistsReferrer_RelationshipByFollowIdList() { return _id_ExistsReferrer_RelationshipByFollowIdListMap; }
    public String keepId_ExistsReferrer_RelationshipByFollowIdList(RelationshipCQ subQuery) {
        if (_id_ExistsReferrer_RelationshipByFollowIdListMap == null) { _id_ExistsReferrer_RelationshipByFollowIdListMap = newLinkedHashMapSized(4); }
        String key = "subQueryMapKey" + (_id_ExistsReferrer_RelationshipByFollowIdListMap.size() + 1);
        _id_ExistsReferrer_RelationshipByFollowIdListMap.put(key, subQuery); return "id_ExistsReferrer_RelationshipByFollowIdList." + key;
    }

    protected Map<String, RelationshipCQ> _id_ExistsReferrer_RelationshipByFollowedIdListMap;
    public Map<String, RelationshipCQ> getId_ExistsReferrer_RelationshipByFollowedIdList() { return _id_ExistsReferrer_RelationshipByFollowedIdListMap; }
    public String keepId_ExistsReferrer_RelationshipByFollowedIdList(RelationshipCQ subQuery) {
        if (_id_ExistsReferrer_RelationshipByFollowedIdListMap == null) { _id_ExistsReferrer_RelationshipByFollowedIdListMap = newLinkedHashMapSized(4); }
        String key = "subQueryMapKey" + (_id_ExistsReferrer_RelationshipByFollowedIdListMap.size() + 1);
        _id_ExistsReferrer_RelationshipByFollowedIdListMap.put(key, subQuery); return "id_ExistsReferrer_RelationshipByFollowedIdList." + key;
    }

    protected Map<String, TweetCQ> _id_ExistsReferrer_TweetListMap;
    public Map<String, TweetCQ> getId_ExistsReferrer_TweetList() { return _id_ExistsReferrer_TweetListMap; }
    public String keepId_ExistsReferrer_TweetList(TweetCQ subQuery) {
        if (_id_ExistsReferrer_TweetListMap == null) { _id_ExistsReferrer_TweetListMap = newLinkedHashMapSized(4); }
        String key = "subQueryMapKey" + (_id_ExistsReferrer_TweetListMap.size() + 1);
        _id_ExistsReferrer_TweetListMap.put(key, subQuery); return "id_ExistsReferrer_TweetList." + key;
    }

    protected Map<String, RelationshipCQ> _id_NotExistsReferrer_RelationshipByFollowIdListMap;
    public Map<String, RelationshipCQ> getId_NotExistsReferrer_RelationshipByFollowIdList() { return _id_NotExistsReferrer_RelationshipByFollowIdListMap; }
    public String keepId_NotExistsReferrer_RelationshipByFollowIdList(RelationshipCQ subQuery) {
        if (_id_NotExistsReferrer_RelationshipByFollowIdListMap == null) { _id_NotExistsReferrer_RelationshipByFollowIdListMap = newLinkedHashMapSized(4); }
        String key = "subQueryMapKey" + (_id_NotExistsReferrer_RelationshipByFollowIdListMap.size() + 1);
        _id_NotExistsReferrer_RelationshipByFollowIdListMap.put(key, subQuery); return "id_NotExistsReferrer_RelationshipByFollowIdList." + key;
    }

    protected Map<String, RelationshipCQ> _id_NotExistsReferrer_RelationshipByFollowedIdListMap;
    public Map<String, RelationshipCQ> getId_NotExistsReferrer_RelationshipByFollowedIdList() { return _id_NotExistsReferrer_RelationshipByFollowedIdListMap; }
    public String keepId_NotExistsReferrer_RelationshipByFollowedIdList(RelationshipCQ subQuery) {
        if (_id_NotExistsReferrer_RelationshipByFollowedIdListMap == null) { _id_NotExistsReferrer_RelationshipByFollowedIdListMap = newLinkedHashMapSized(4); }
        String key = "subQueryMapKey" + (_id_NotExistsReferrer_RelationshipByFollowedIdListMap.size() + 1);
        _id_NotExistsReferrer_RelationshipByFollowedIdListMap.put(key, subQuery); return "id_NotExistsReferrer_RelationshipByFollowedIdList." + key;
    }

    protected Map<String, TweetCQ> _id_NotExistsReferrer_TweetListMap;
    public Map<String, TweetCQ> getId_NotExistsReferrer_TweetList() { return _id_NotExistsReferrer_TweetListMap; }
    public String keepId_NotExistsReferrer_TweetList(TweetCQ subQuery) {
        if (_id_NotExistsReferrer_TweetListMap == null) { _id_NotExistsReferrer_TweetListMap = newLinkedHashMapSized(4); }
        String key = "subQueryMapKey" + (_id_NotExistsReferrer_TweetListMap.size() + 1);
        _id_NotExistsReferrer_TweetListMap.put(key, subQuery); return "id_NotExistsReferrer_TweetList." + key;
    }

    protected Map<String, RelationshipCQ> _id_SpecifyDerivedReferrer_RelationshipByFollowIdListMap;
    public Map<String, RelationshipCQ> getId_SpecifyDerivedReferrer_RelationshipByFollowIdList() { return _id_SpecifyDerivedReferrer_RelationshipByFollowIdListMap; }
    public String keepId_SpecifyDerivedReferrer_RelationshipByFollowIdList(RelationshipCQ subQuery) {
        if (_id_SpecifyDerivedReferrer_RelationshipByFollowIdListMap == null) { _id_SpecifyDerivedReferrer_RelationshipByFollowIdListMap = newLinkedHashMapSized(4); }
        String key = "subQueryMapKey" + (_id_SpecifyDerivedReferrer_RelationshipByFollowIdListMap.size() + 1);
        _id_SpecifyDerivedReferrer_RelationshipByFollowIdListMap.put(key, subQuery); return "id_SpecifyDerivedReferrer_RelationshipByFollowIdList." + key;
    }

    protected Map<String, RelationshipCQ> _id_SpecifyDerivedReferrer_RelationshipByFollowedIdListMap;
    public Map<String, RelationshipCQ> getId_SpecifyDerivedReferrer_RelationshipByFollowedIdList() { return _id_SpecifyDerivedReferrer_RelationshipByFollowedIdListMap; }
    public String keepId_SpecifyDerivedReferrer_RelationshipByFollowedIdList(RelationshipCQ subQuery) {
        if (_id_SpecifyDerivedReferrer_RelationshipByFollowedIdListMap == null) { _id_SpecifyDerivedReferrer_RelationshipByFollowedIdListMap = newLinkedHashMapSized(4); }
        String key = "subQueryMapKey" + (_id_SpecifyDerivedReferrer_RelationshipByFollowedIdListMap.size() + 1);
        _id_SpecifyDerivedReferrer_RelationshipByFollowedIdListMap.put(key, subQuery); return "id_SpecifyDerivedReferrer_RelationshipByFollowedIdList." + key;
    }

    protected Map<String, TweetCQ> _id_SpecifyDerivedReferrer_TweetListMap;
    public Map<String, TweetCQ> getId_SpecifyDerivedReferrer_TweetList() { return _id_SpecifyDerivedReferrer_TweetListMap; }
    public String keepId_SpecifyDerivedReferrer_TweetList(TweetCQ subQuery) {
        if (_id_SpecifyDerivedReferrer_TweetListMap == null) { _id_SpecifyDerivedReferrer_TweetListMap = newLinkedHashMapSized(4); }
        String key = "subQueryMapKey" + (_id_SpecifyDerivedReferrer_TweetListMap.size() + 1);
        _id_SpecifyDerivedReferrer_TweetListMap.put(key, subQuery); return "id_SpecifyDerivedReferrer_TweetList." + key;
    }

    protected Map<String, RelationshipCQ> _id_InScopeRelation_RelationshipByFollowIdListMap;
    public Map<String, RelationshipCQ> getId_InScopeRelation_RelationshipByFollowIdList() { return _id_InScopeRelation_RelationshipByFollowIdListMap; }
    public String keepId_InScopeRelation_RelationshipByFollowIdList(RelationshipCQ subQuery) {
        if (_id_InScopeRelation_RelationshipByFollowIdListMap == null) { _id_InScopeRelation_RelationshipByFollowIdListMap = newLinkedHashMapSized(4); }
        String key = "subQueryMapKey" + (_id_InScopeRelation_RelationshipByFollowIdListMap.size() + 1);
        _id_InScopeRelation_RelationshipByFollowIdListMap.put(key, subQuery); return "id_InScopeRelation_RelationshipByFollowIdList." + key;
    }

    protected Map<String, RelationshipCQ> _id_InScopeRelation_RelationshipByFollowedIdListMap;
    public Map<String, RelationshipCQ> getId_InScopeRelation_RelationshipByFollowedIdList() { return _id_InScopeRelation_RelationshipByFollowedIdListMap; }
    public String keepId_InScopeRelation_RelationshipByFollowedIdList(RelationshipCQ subQuery) {
        if (_id_InScopeRelation_RelationshipByFollowedIdListMap == null) { _id_InScopeRelation_RelationshipByFollowedIdListMap = newLinkedHashMapSized(4); }
        String key = "subQueryMapKey" + (_id_InScopeRelation_RelationshipByFollowedIdListMap.size() + 1);
        _id_InScopeRelation_RelationshipByFollowedIdListMap.put(key, subQuery); return "id_InScopeRelation_RelationshipByFollowedIdList." + key;
    }

    protected Map<String, TweetCQ> _id_InScopeRelation_TweetListMap;
    public Map<String, TweetCQ> getId_InScopeRelation_TweetList() { return _id_InScopeRelation_TweetListMap; }
    public String keepId_InScopeRelation_TweetList(TweetCQ subQuery) {
        if (_id_InScopeRelation_TweetListMap == null) { _id_InScopeRelation_TweetListMap = newLinkedHashMapSized(4); }
        String key = "subQueryMapKey" + (_id_InScopeRelation_TweetListMap.size() + 1);
        _id_InScopeRelation_TweetListMap.put(key, subQuery); return "id_InScopeRelation_TweetList." + key;
    }

    protected Map<String, RelationshipCQ> _id_NotInScopeRelation_RelationshipByFollowIdListMap;
    public Map<String, RelationshipCQ> getId_NotInScopeRelation_RelationshipByFollowIdList() { return _id_NotInScopeRelation_RelationshipByFollowIdListMap; }
    public String keepId_NotInScopeRelation_RelationshipByFollowIdList(RelationshipCQ subQuery) {
        if (_id_NotInScopeRelation_RelationshipByFollowIdListMap == null) { _id_NotInScopeRelation_RelationshipByFollowIdListMap = newLinkedHashMapSized(4); }
        String key = "subQueryMapKey" + (_id_NotInScopeRelation_RelationshipByFollowIdListMap.size() + 1);
        _id_NotInScopeRelation_RelationshipByFollowIdListMap.put(key, subQuery); return "id_NotInScopeRelation_RelationshipByFollowIdList." + key;
    }

    protected Map<String, RelationshipCQ> _id_NotInScopeRelation_RelationshipByFollowedIdListMap;
    public Map<String, RelationshipCQ> getId_NotInScopeRelation_RelationshipByFollowedIdList() { return _id_NotInScopeRelation_RelationshipByFollowedIdListMap; }
    public String keepId_NotInScopeRelation_RelationshipByFollowedIdList(RelationshipCQ subQuery) {
        if (_id_NotInScopeRelation_RelationshipByFollowedIdListMap == null) { _id_NotInScopeRelation_RelationshipByFollowedIdListMap = newLinkedHashMapSized(4); }
        String key = "subQueryMapKey" + (_id_NotInScopeRelation_RelationshipByFollowedIdListMap.size() + 1);
        _id_NotInScopeRelation_RelationshipByFollowedIdListMap.put(key, subQuery); return "id_NotInScopeRelation_RelationshipByFollowedIdList." + key;
    }

    protected Map<String, TweetCQ> _id_NotInScopeRelation_TweetListMap;
    public Map<String, TweetCQ> getId_NotInScopeRelation_TweetList() { return _id_NotInScopeRelation_TweetListMap; }
    public String keepId_NotInScopeRelation_TweetList(TweetCQ subQuery) {
        if (_id_NotInScopeRelation_TweetListMap == null) { _id_NotInScopeRelation_TweetListMap = newLinkedHashMapSized(4); }
        String key = "subQueryMapKey" + (_id_NotInScopeRelation_TweetListMap.size() + 1);
        _id_NotInScopeRelation_TweetListMap.put(key, subQuery); return "id_NotInScopeRelation_TweetList." + key;
    }

    protected Map<String, RelationshipCQ> _id_QueryDerivedReferrer_RelationshipByFollowIdListMap;
    public Map<String, RelationshipCQ> getId_QueryDerivedReferrer_RelationshipByFollowIdList() { return _id_QueryDerivedReferrer_RelationshipByFollowIdListMap; }
    public String keepId_QueryDerivedReferrer_RelationshipByFollowIdList(RelationshipCQ subQuery) {
        if (_id_QueryDerivedReferrer_RelationshipByFollowIdListMap == null) { _id_QueryDerivedReferrer_RelationshipByFollowIdListMap = newLinkedHashMapSized(4); }
        String key = "subQueryMapKey" + (_id_QueryDerivedReferrer_RelationshipByFollowIdListMap.size() + 1);
        _id_QueryDerivedReferrer_RelationshipByFollowIdListMap.put(key, subQuery); return "id_QueryDerivedReferrer_RelationshipByFollowIdList." + key;
    }
    protected Map<String, Object> _id_QueryDerivedReferrer_RelationshipByFollowIdListParameterMap;
    public Map<String, Object> getId_QueryDerivedReferrer_RelationshipByFollowIdListParameter() { return _id_QueryDerivedReferrer_RelationshipByFollowIdListParameterMap; }
    public String keepId_QueryDerivedReferrer_RelationshipByFollowIdListParameter(Object parameterValue) {
        if (_id_QueryDerivedReferrer_RelationshipByFollowIdListParameterMap == null) { _id_QueryDerivedReferrer_RelationshipByFollowIdListParameterMap = newLinkedHashMapSized(4); }
        String key = "subQueryParameterKey" + (_id_QueryDerivedReferrer_RelationshipByFollowIdListParameterMap.size() + 1);
        _id_QueryDerivedReferrer_RelationshipByFollowIdListParameterMap.put(key, parameterValue); return "id_QueryDerivedReferrer_RelationshipByFollowIdListParameter." + key;
    }

    protected Map<String, RelationshipCQ> _id_QueryDerivedReferrer_RelationshipByFollowedIdListMap;
    public Map<String, RelationshipCQ> getId_QueryDerivedReferrer_RelationshipByFollowedIdList() { return _id_QueryDerivedReferrer_RelationshipByFollowedIdListMap; }
    public String keepId_QueryDerivedReferrer_RelationshipByFollowedIdList(RelationshipCQ subQuery) {
        if (_id_QueryDerivedReferrer_RelationshipByFollowedIdListMap == null) { _id_QueryDerivedReferrer_RelationshipByFollowedIdListMap = newLinkedHashMapSized(4); }
        String key = "subQueryMapKey" + (_id_QueryDerivedReferrer_RelationshipByFollowedIdListMap.size() + 1);
        _id_QueryDerivedReferrer_RelationshipByFollowedIdListMap.put(key, subQuery); return "id_QueryDerivedReferrer_RelationshipByFollowedIdList." + key;
    }
    protected Map<String, Object> _id_QueryDerivedReferrer_RelationshipByFollowedIdListParameterMap;
    public Map<String, Object> getId_QueryDerivedReferrer_RelationshipByFollowedIdListParameter() { return _id_QueryDerivedReferrer_RelationshipByFollowedIdListParameterMap; }
    public String keepId_QueryDerivedReferrer_RelationshipByFollowedIdListParameter(Object parameterValue) {
        if (_id_QueryDerivedReferrer_RelationshipByFollowedIdListParameterMap == null) { _id_QueryDerivedReferrer_RelationshipByFollowedIdListParameterMap = newLinkedHashMapSized(4); }
        String key = "subQueryParameterKey" + (_id_QueryDerivedReferrer_RelationshipByFollowedIdListParameterMap.size() + 1);
        _id_QueryDerivedReferrer_RelationshipByFollowedIdListParameterMap.put(key, parameterValue); return "id_QueryDerivedReferrer_RelationshipByFollowedIdListParameter." + key;
    }

    protected Map<String, TweetCQ> _id_QueryDerivedReferrer_TweetListMap;
    public Map<String, TweetCQ> getId_QueryDerivedReferrer_TweetList() { return _id_QueryDerivedReferrer_TweetListMap; }
    public String keepId_QueryDerivedReferrer_TweetList(TweetCQ subQuery) {
        if (_id_QueryDerivedReferrer_TweetListMap == null) { _id_QueryDerivedReferrer_TweetListMap = newLinkedHashMapSized(4); }
        String key = "subQueryMapKey" + (_id_QueryDerivedReferrer_TweetListMap.size() + 1);
        _id_QueryDerivedReferrer_TweetListMap.put(key, subQuery); return "id_QueryDerivedReferrer_TweetList." + key;
    }
    protected Map<String, Object> _id_QueryDerivedReferrer_TweetListParameterMap;
    public Map<String, Object> getId_QueryDerivedReferrer_TweetListParameter() { return _id_QueryDerivedReferrer_TweetListParameterMap; }
    public String keepId_QueryDerivedReferrer_TweetListParameter(Object parameterValue) {
        if (_id_QueryDerivedReferrer_TweetListParameterMap == null) { _id_QueryDerivedReferrer_TweetListParameterMap = newLinkedHashMapSized(4); }
        String key = "subQueryParameterKey" + (_id_QueryDerivedReferrer_TweetListParameterMap.size() + 1);
        _id_QueryDerivedReferrer_TweetListParameterMap.put(key, parameterValue); return "id_QueryDerivedReferrer_TweetListParameter." + key;
    }

    /** 
     * Add order-by as ascend. <br />
     * id: {PK, ID, NotNull, INT UNSIGNED(10)}
     * @return this. (NotNull)
     */
    public BsUserCQ addOrderBy_Id_Asc() { regOBA("id"); return this; }

    /**
     * Add order-by as descend. <br />
     * id: {PK, ID, NotNull, INT UNSIGNED(10)}
     * @return this. (NotNull)
     */
    public BsUserCQ addOrderBy_Id_Desc() { regOBD("id"); return this; }

    protected ConditionValue _username;
    public ConditionValue getUsername() {
        if (_username == null) { _username = nCV(); }
        return _username;
    }
    protected ConditionValue getCValueUsername() { return getUsername(); }

    /** 
     * Add order-by as ascend. <br />
     * username: {NotNull, CHAR(50)}
     * @return this. (NotNull)
     */
    public BsUserCQ addOrderBy_Username_Asc() { regOBA("username"); return this; }

    /**
     * Add order-by as descend. <br />
     * username: {NotNull, CHAR(50)}
     * @return this. (NotNull)
     */
    public BsUserCQ addOrderBy_Username_Desc() { regOBD("username"); return this; }

    protected ConditionValue _password;
    public ConditionValue getPassword() {
        if (_password == null) { _password = nCV(); }
        return _password;
    }
    protected ConditionValue getCValuePassword() { return getPassword(); }

    /** 
     * Add order-by as ascend. <br />
     * password: {NotNull, CHAR(255)}
     * @return this. (NotNull)
     */
    public BsUserCQ addOrderBy_Password_Asc() { regOBA("password"); return this; }

    /**
     * Add order-by as descend. <br />
     * password: {NotNull, CHAR(255)}
     * @return this. (NotNull)
     */
    public BsUserCQ addOrderBy_Password_Desc() { regOBD("password"); return this; }

    protected ConditionValue _email;
    public ConditionValue getEmail() {
        if (_email == null) { _email = nCV(); }
        return _email;
    }
    protected ConditionValue getCValueEmail() { return getEmail(); }

    /** 
     * Add order-by as ascend. <br />
     * email: {NotNull, CHAR(100)}
     * @return this. (NotNull)
     */
    public BsUserCQ addOrderBy_Email_Asc() { regOBA("email"); return this; }

    /**
     * Add order-by as descend. <br />
     * email: {NotNull, CHAR(100)}
     * @return this. (NotNull)
     */
    public BsUserCQ addOrderBy_Email_Desc() { regOBD("email"); return this; }

    protected ConditionValue _createAt;
    public ConditionValue getCreateAt() {
        if (_createAt == null) { _createAt = nCV(); }
        return _createAt;
    }
    protected ConditionValue getCValueCreateAt() { return getCreateAt(); }

    /** 
     * Add order-by as ascend. <br />
     * create_at: {NotNull, TIMESTAMP(19), default=[CURRENT_TIMESTAMP]}
     * @return this. (NotNull)
     */
    public BsUserCQ addOrderBy_CreateAt_Asc() { regOBA("create_at"); return this; }

    /**
     * Add order-by as descend. <br />
     * create_at: {NotNull, TIMESTAMP(19), default=[CURRENT_TIMESTAMP]}
     * @return this. (NotNull)
     */
    public BsUserCQ addOrderBy_CreateAt_Desc() { regOBD("create_at"); return this; }

    // ===================================================================================
    //                                                             SpecifiedDerivedOrderBy
    //                                                             =======================
    /**
     * Add order-by for specified derived column as ascend.
     * <pre>
     * cb.specify().derivedPurchaseList().max(new SubQuery&lt;PurchaseCB&gt;() {
     *     public void query(PurchaseCB subCB) {
     *         subCB.specify().columnPurchaseDatetime();
     *     }
     * }, <span style="color: #FD4747">aliasName</span>);
     * <span style="color: #3F7E5E">// order by [alias-name] asc</span>
     * cb.<span style="color: #FD4747">addSpecifiedDerivedOrderBy_Asc</span>(<span style="color: #FD4747">aliasName</span>);
     * </pre>
     * @param aliasName The alias name specified at (Specify)DerivedReferrer. (NotNull)
     * @return this. (NotNull)
     */
    public BsUserCQ addSpecifiedDerivedOrderBy_Asc(String aliasName)
    { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

    /**
     * Add order-by for specified derived column as descend.
     * <pre>
     * cb.specify().derivedPurchaseList().max(new SubQuery&lt;PurchaseCB&gt;() {
     *     public void query(PurchaseCB subCB) {
     *         subCB.specify().columnPurchaseDatetime();
     *     }
     * }, <span style="color: #FD4747">aliasName</span>);
     * <span style="color: #3F7E5E">// order by [alias-name] desc</span>
     * cb.<span style="color: #FD4747">addSpecifiedDerivedOrderBy_Desc</span>(<span style="color: #FD4747">aliasName</span>);
     * </pre>
     * @param aliasName The alias name specified at (Specify)DerivedReferrer. (NotNull)
     * @return this. (NotNull)
     */
    public BsUserCQ addSpecifiedDerivedOrderBy_Desc(String aliasName)
    { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    protected void reflectRelationOnUnionQuery(ConditionQuery baseQueryAsSuper, ConditionQuery unionQueryAsSuper) {
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    protected Map<String, UserCQ> _scalarConditionMap;
    public Map<String, UserCQ> getScalarCondition() { return _scalarConditionMap; }
    public String keepScalarCondition(UserCQ subQuery) {
        if (_scalarConditionMap == null) { _scalarConditionMap = newLinkedHashMapSized(4); }
        String key = "subQueryMapKey" + (_scalarConditionMap.size() + 1);
        _scalarConditionMap.put(key, subQuery); return "scalarCondition." + key;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    protected Map<String, UserCQ> _specifyMyselfDerivedMap;
    public Map<String, UserCQ> getSpecifyMyselfDerived() { return _specifyMyselfDerivedMap; }
    public String keepSpecifyMyselfDerived(UserCQ subQuery) {
        if (_specifyMyselfDerivedMap == null) { _specifyMyselfDerivedMap = newLinkedHashMapSized(4); }
        String key = "subQueryMapKey" + (_specifyMyselfDerivedMap.size() + 1);
        _specifyMyselfDerivedMap.put(key, subQuery); return "specifyMyselfDerived." + key;
    }

    protected Map<String, UserCQ> _queryMyselfDerivedMap;
    public Map<String, UserCQ> getQueryMyselfDerived() { return _queryMyselfDerivedMap; }
    public String keepQueryMyselfDerived(UserCQ subQuery) {
        if (_queryMyselfDerivedMap == null) { _queryMyselfDerivedMap = newLinkedHashMapSized(4); }
        String key = "subQueryMapKey" + (_queryMyselfDerivedMap.size() + 1);
        _queryMyselfDerivedMap.put(key, subQuery); return "queryMyselfDerived." + key;
    }
    protected Map<String, Object> _qyeryMyselfDerivedParameterMap;
    public Map<String, Object> getQueryMyselfDerivedParameter() { return _qyeryMyselfDerivedParameterMap; }
    public String keepQueryMyselfDerivedParameter(Object parameterValue) {
        if (_qyeryMyselfDerivedParameterMap == null) { _qyeryMyselfDerivedParameterMap = newLinkedHashMapSized(4); }
        String key = "subQueryParameterKey" + (_qyeryMyselfDerivedParameterMap.size() + 1);
        _qyeryMyselfDerivedParameterMap.put(key, parameterValue); return "queryMyselfDerivedParameter." + key;
    }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, UserCQ> _myselfExistsMap;
    public Map<String, UserCQ> getMyselfExists() { return _myselfExistsMap; }
    public String keepMyselfExists(UserCQ subQuery) {
        if (_myselfExistsMap == null) { _myselfExistsMap = newLinkedHashMapSized(4); }
        String key = "subQueryMapKey" + (_myselfExistsMap.size() + 1);
        _myselfExistsMap.put(key, subQuery); return "myselfExists." + key;
    }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    protected Map<String, UserCQ> _myselfInScopeMap;
    public Map<String, UserCQ> getMyselfInScope() { return _myselfInScopeMap; }
    public String keepMyselfInScope(UserCQ subQuery) {
        if (_myselfInScopeMap == null) { _myselfInScopeMap = newLinkedHashMapSized(4); }
        String key = "subQueryMapKey" + (_myselfInScopeMap.size() + 1);
        _myselfInScopeMap.put(key, subQuery); return "myselfInScope." + key;
    }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return UserCB.class.getName(); }
    protected String xCQ() { return UserCQ.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
