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
 * The base condition-query of tweet.
 * @author DBFlute(AutoGenerator)
 */
public class BsTweetCQ extends AbstractBsTweetCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected TweetCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsTweetCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(childQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br />
     * {select ... from ... left outer join (select * from tweet) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #FD4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public TweetCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected TweetCIQ xcreateCIQ() {
        TweetCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected TweetCIQ xnewCIQ() {
        return new TweetCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br />
     * {select ... from ... left outer join tweet on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #FD4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public TweetCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        TweetCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
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

    /** 
     * Add order-by as ascend. <br />
     * id: {PK, ID, NotNull, INT UNSIGNED(10)}
     * @return this. (NotNull)
     */
    public BsTweetCQ addOrderBy_Id_Asc() { regOBA("id"); return this; }

    /**
     * Add order-by as descend. <br />
     * id: {PK, ID, NotNull, INT UNSIGNED(10)}
     * @return this. (NotNull)
     */
    public BsTweetCQ addOrderBy_Id_Desc() { regOBD("id"); return this; }

    protected ConditionValue _userId;
    public ConditionValue getUserId() {
        if (_userId == null) { _userId = nCV(); }
        return _userId;
    }
    protected ConditionValue getCValueUserId() { return getUserId(); }

    protected Map<String, UserCQ> _userId_InScopeRelation_UserMap;
    public Map<String, UserCQ> getUserId_InScopeRelation_User() { return _userId_InScopeRelation_UserMap; }
    public String keepUserId_InScopeRelation_User(UserCQ subQuery) {
        if (_userId_InScopeRelation_UserMap == null) { _userId_InScopeRelation_UserMap = newLinkedHashMapSized(4); }
        String key = "subQueryMapKey" + (_userId_InScopeRelation_UserMap.size() + 1);
        _userId_InScopeRelation_UserMap.put(key, subQuery); return "userId_InScopeRelation_User." + key;
    }

    protected Map<String, UserCQ> _userId_NotInScopeRelation_UserMap;
    public Map<String, UserCQ> getUserId_NotInScopeRelation_User() { return _userId_NotInScopeRelation_UserMap; }
    public String keepUserId_NotInScopeRelation_User(UserCQ subQuery) {
        if (_userId_NotInScopeRelation_UserMap == null) { _userId_NotInScopeRelation_UserMap = newLinkedHashMapSized(4); }
        String key = "subQueryMapKey" + (_userId_NotInScopeRelation_UserMap.size() + 1);
        _userId_NotInScopeRelation_UserMap.put(key, subQuery); return "userId_NotInScopeRelation_User." + key;
    }

    /** 
     * Add order-by as ascend. <br />
     * user_id: {IX, NotNull, INT UNSIGNED(10), FK to user}
     * @return this. (NotNull)
     */
    public BsTweetCQ addOrderBy_UserId_Asc() { regOBA("user_id"); return this; }

    /**
     * Add order-by as descend. <br />
     * user_id: {IX, NotNull, INT UNSIGNED(10), FK to user}
     * @return this. (NotNull)
     */
    public BsTweetCQ addOrderBy_UserId_Desc() { regOBD("user_id"); return this; }

    protected ConditionValue _tweet;
    public ConditionValue getTweet() {
        if (_tweet == null) { _tweet = nCV(); }
        return _tweet;
    }
    protected ConditionValue getCValueTweet() { return getTweet(); }

    /** 
     * Add order-by as ascend. <br />
     * tweet: {NotNull, CHAR(140)}
     * @return this. (NotNull)
     */
    public BsTweetCQ addOrderBy_Tweet_Asc() { regOBA("tweet"); return this; }

    /**
     * Add order-by as descend. <br />
     * tweet: {NotNull, CHAR(140)}
     * @return this. (NotNull)
     */
    public BsTweetCQ addOrderBy_Tweet_Desc() { regOBD("tweet"); return this; }

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
    public BsTweetCQ addOrderBy_CreateAt_Asc() { regOBA("create_at"); return this; }

    /**
     * Add order-by as descend. <br />
     * create_at: {NotNull, TIMESTAMP(19), default=[CURRENT_TIMESTAMP]}
     * @return this. (NotNull)
     */
    public BsTweetCQ addOrderBy_CreateAt_Desc() { regOBD("create_at"); return this; }

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
    public BsTweetCQ addSpecifiedDerivedOrderBy_Asc(String aliasName)
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
    public BsTweetCQ addSpecifiedDerivedOrderBy_Desc(String aliasName)
    { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    protected void reflectRelationOnUnionQuery(ConditionQuery baseQueryAsSuper, ConditionQuery unionQueryAsSuper) {
        TweetCQ baseQuery = (TweetCQ)baseQueryAsSuper;
        TweetCQ unionQuery = (TweetCQ)unionQueryAsSuper;
        if (baseQuery.hasConditionQueryUser()) {
            unionQuery.queryUser().reflectRelationOnUnionQuery(baseQuery.queryUser(), unionQuery.queryUser());
        }
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    /**
     * Get the condition-query for relation table. <br />
     * user by my user_id, named 'user'.
     * @return The instance of condition-query. (NotNull)
     */
    public UserCQ queryUser() {
        return getConditionQueryUser();
    }
    protected UserCQ _conditionQueryUser;
    public UserCQ getConditionQueryUser() {
        if (_conditionQueryUser == null) {
            _conditionQueryUser = xcreateQueryUser();
            xsetupOuterJoinUser();
        }
        return _conditionQueryUser;
    }
    protected UserCQ xcreateQueryUser() {
        String nrp = resolveNextRelationPath("tweet", "user");
        String jan = resolveJoinAliasName(nrp, xgetNextNestLevel());
        UserCQ cq = new UserCQ(this, xgetSqlClause(), jan, xgetNextNestLevel());
        cq.xsetBaseCB(_baseCB);
        cq.xsetForeignPropertyName("user");
        cq.xsetRelationPath(nrp); return cq;
    }
    protected void xsetupOuterJoinUser() {
        UserCQ cq = getConditionQueryUser();
        Map<String, String> joinOnMap = newLinkedHashMapSized(4);
        joinOnMap.put("user_id", "id");
        registerOuterJoin(cq, joinOnMap, "user");
    }
    public boolean hasConditionQueryUser() {
        return _conditionQueryUser != null;
    }

    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    protected Map<String, TweetCQ> _scalarConditionMap;
    public Map<String, TweetCQ> getScalarCondition() { return _scalarConditionMap; }
    public String keepScalarCondition(TweetCQ subQuery) {
        if (_scalarConditionMap == null) { _scalarConditionMap = newLinkedHashMapSized(4); }
        String key = "subQueryMapKey" + (_scalarConditionMap.size() + 1);
        _scalarConditionMap.put(key, subQuery); return "scalarCondition." + key;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    protected Map<String, TweetCQ> _specifyMyselfDerivedMap;
    public Map<String, TweetCQ> getSpecifyMyselfDerived() { return _specifyMyselfDerivedMap; }
    public String keepSpecifyMyselfDerived(TweetCQ subQuery) {
        if (_specifyMyselfDerivedMap == null) { _specifyMyselfDerivedMap = newLinkedHashMapSized(4); }
        String key = "subQueryMapKey" + (_specifyMyselfDerivedMap.size() + 1);
        _specifyMyselfDerivedMap.put(key, subQuery); return "specifyMyselfDerived." + key;
    }

    protected Map<String, TweetCQ> _queryMyselfDerivedMap;
    public Map<String, TweetCQ> getQueryMyselfDerived() { return _queryMyselfDerivedMap; }
    public String keepQueryMyselfDerived(TweetCQ subQuery) {
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
    protected Map<String, TweetCQ> _myselfExistsMap;
    public Map<String, TweetCQ> getMyselfExists() { return _myselfExistsMap; }
    public String keepMyselfExists(TweetCQ subQuery) {
        if (_myselfExistsMap == null) { _myselfExistsMap = newLinkedHashMapSized(4); }
        String key = "subQueryMapKey" + (_myselfExistsMap.size() + 1);
        _myselfExistsMap.put(key, subQuery); return "myselfExists." + key;
    }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    protected Map<String, TweetCQ> _myselfInScopeMap;
    public Map<String, TweetCQ> getMyselfInScope() { return _myselfInScopeMap; }
    public String keepMyselfInScope(TweetCQ subQuery) {
        if (_myselfInScopeMap == null) { _myselfInScopeMap = newLinkedHashMapSized(4); }
        String key = "subQueryMapKey" + (_myselfInScopeMap.size() + 1);
        _myselfInScopeMap.put(key, subQuery); return "myselfInScope." + key;
    }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return TweetCB.class.getName(); }
    protected String xCQ() { return TweetCQ.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
