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
 * The base condition-query of relationship.
 * @author DBFlute(AutoGenerator)
 */
public class BsRelationshipCQ extends AbstractBsRelationshipCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected RelationshipCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsRelationshipCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(childQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br />
     * {select ... from ... left outer join (select * from relationship) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #FD4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public RelationshipCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected RelationshipCIQ xcreateCIQ() {
        RelationshipCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected RelationshipCIQ xnewCIQ() {
        return new RelationshipCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br />
     * {select ... from ... left outer join relationship on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #FD4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public RelationshipCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        RelationshipCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
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
    public BsRelationshipCQ addOrderBy_Id_Asc() { regOBA("id"); return this; }

    /**
     * Add order-by as descend. <br />
     * id: {PK, ID, NotNull, INT UNSIGNED(10)}
     * @return this. (NotNull)
     */
    public BsRelationshipCQ addOrderBy_Id_Desc() { regOBD("id"); return this; }

    protected ConditionValue _followId;
    public ConditionValue getFollowId() {
        if (_followId == null) { _followId = nCV(); }
        return _followId;
    }
    protected ConditionValue getCValueFollowId() { return getFollowId(); }

    protected Map<String, UserCQ> _followId_InScopeRelation_UserByFollowIdMap;
    public Map<String, UserCQ> getFollowId_InScopeRelation_UserByFollowId() { return _followId_InScopeRelation_UserByFollowIdMap; }
    public String keepFollowId_InScopeRelation_UserByFollowId(UserCQ subQuery) {
        if (_followId_InScopeRelation_UserByFollowIdMap == null) { _followId_InScopeRelation_UserByFollowIdMap = newLinkedHashMapSized(4); }
        String key = "subQueryMapKey" + (_followId_InScopeRelation_UserByFollowIdMap.size() + 1);
        _followId_InScopeRelation_UserByFollowIdMap.put(key, subQuery); return "followId_InScopeRelation_UserByFollowId." + key;
    }

    protected Map<String, UserCQ> _followId_NotInScopeRelation_UserByFollowIdMap;
    public Map<String, UserCQ> getFollowId_NotInScopeRelation_UserByFollowId() { return _followId_NotInScopeRelation_UserByFollowIdMap; }
    public String keepFollowId_NotInScopeRelation_UserByFollowId(UserCQ subQuery) {
        if (_followId_NotInScopeRelation_UserByFollowIdMap == null) { _followId_NotInScopeRelation_UserByFollowIdMap = newLinkedHashMapSized(4); }
        String key = "subQueryMapKey" + (_followId_NotInScopeRelation_UserByFollowIdMap.size() + 1);
        _followId_NotInScopeRelation_UserByFollowIdMap.put(key, subQuery); return "followId_NotInScopeRelation_UserByFollowId." + key;
    }

    /** 
     * Add order-by as ascend. <br />
     * follow_id: {UQ, NotNull, INT UNSIGNED(10), FK to user}
     * @return this. (NotNull)
     */
    public BsRelationshipCQ addOrderBy_FollowId_Asc() { regOBA("follow_id"); return this; }

    /**
     * Add order-by as descend. <br />
     * follow_id: {UQ, NotNull, INT UNSIGNED(10), FK to user}
     * @return this. (NotNull)
     */
    public BsRelationshipCQ addOrderBy_FollowId_Desc() { regOBD("follow_id"); return this; }

    protected ConditionValue _followedId;
    public ConditionValue getFollowedId() {
        if (_followedId == null) { _followedId = nCV(); }
        return _followedId;
    }
    protected ConditionValue getCValueFollowedId() { return getFollowedId(); }

    protected Map<String, UserCQ> _followedId_InScopeRelation_UserByFollowedIdMap;
    public Map<String, UserCQ> getFollowedId_InScopeRelation_UserByFollowedId() { return _followedId_InScopeRelation_UserByFollowedIdMap; }
    public String keepFollowedId_InScopeRelation_UserByFollowedId(UserCQ subQuery) {
        if (_followedId_InScopeRelation_UserByFollowedIdMap == null) { _followedId_InScopeRelation_UserByFollowedIdMap = newLinkedHashMapSized(4); }
        String key = "subQueryMapKey" + (_followedId_InScopeRelation_UserByFollowedIdMap.size() + 1);
        _followedId_InScopeRelation_UserByFollowedIdMap.put(key, subQuery); return "followedId_InScopeRelation_UserByFollowedId." + key;
    }

    protected Map<String, UserCQ> _followedId_NotInScopeRelation_UserByFollowedIdMap;
    public Map<String, UserCQ> getFollowedId_NotInScopeRelation_UserByFollowedId() { return _followedId_NotInScopeRelation_UserByFollowedIdMap; }
    public String keepFollowedId_NotInScopeRelation_UserByFollowedId(UserCQ subQuery) {
        if (_followedId_NotInScopeRelation_UserByFollowedIdMap == null) { _followedId_NotInScopeRelation_UserByFollowedIdMap = newLinkedHashMapSized(4); }
        String key = "subQueryMapKey" + (_followedId_NotInScopeRelation_UserByFollowedIdMap.size() + 1);
        _followedId_NotInScopeRelation_UserByFollowedIdMap.put(key, subQuery); return "followedId_NotInScopeRelation_UserByFollowedId." + key;
    }

    /** 
     * Add order-by as ascend. <br />
     * followed_id: {UQ+, IX, NotNull, INT UNSIGNED(10), FK to user}
     * @return this. (NotNull)
     */
    public BsRelationshipCQ addOrderBy_FollowedId_Asc() { regOBA("followed_id"); return this; }

    /**
     * Add order-by as descend. <br />
     * followed_id: {UQ+, IX, NotNull, INT UNSIGNED(10), FK to user}
     * @return this. (NotNull)
     */
    public BsRelationshipCQ addOrderBy_FollowedId_Desc() { regOBD("followed_id"); return this; }

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
    public BsRelationshipCQ addSpecifiedDerivedOrderBy_Asc(String aliasName)
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
    public BsRelationshipCQ addSpecifiedDerivedOrderBy_Desc(String aliasName)
    { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    protected void reflectRelationOnUnionQuery(ConditionQuery baseQueryAsSuper, ConditionQuery unionQueryAsSuper) {
        RelationshipCQ baseQuery = (RelationshipCQ)baseQueryAsSuper;
        RelationshipCQ unionQuery = (RelationshipCQ)unionQueryAsSuper;
        if (baseQuery.hasConditionQueryUserByFollowId()) {
            unionQuery.queryUserByFollowId().reflectRelationOnUnionQuery(baseQuery.queryUserByFollowId(), unionQuery.queryUserByFollowId());
        }
        if (baseQuery.hasConditionQueryUserByFollowedId()) {
            unionQuery.queryUserByFollowedId().reflectRelationOnUnionQuery(baseQuery.queryUserByFollowedId(), unionQuery.queryUserByFollowedId());
        }
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    /**
     * Get the condition-query for relation table. <br />
     * user by my follow_id, named 'userByFollowId'.
     * @return The instance of condition-query. (NotNull)
     */
    public UserCQ queryUserByFollowId() {
        return getConditionQueryUserByFollowId();
    }
    protected UserCQ _conditionQueryUserByFollowId;
    public UserCQ getConditionQueryUserByFollowId() {
        if (_conditionQueryUserByFollowId == null) {
            _conditionQueryUserByFollowId = xcreateQueryUserByFollowId();
            xsetupOuterJoinUserByFollowId();
        }
        return _conditionQueryUserByFollowId;
    }
    protected UserCQ xcreateQueryUserByFollowId() {
        String nrp = resolveNextRelationPath("relationship", "userByFollowId");
        String jan = resolveJoinAliasName(nrp, xgetNextNestLevel());
        UserCQ cq = new UserCQ(this, xgetSqlClause(), jan, xgetNextNestLevel());
        cq.xsetBaseCB(_baseCB);
        cq.xsetForeignPropertyName("userByFollowId");
        cq.xsetRelationPath(nrp); return cq;
    }
    protected void xsetupOuterJoinUserByFollowId() {
        UserCQ cq = getConditionQueryUserByFollowId();
        Map<String, String> joinOnMap = newLinkedHashMapSized(4);
        joinOnMap.put("follow_id", "id");
        registerOuterJoin(cq, joinOnMap, "userByFollowId");
    }
    public boolean hasConditionQueryUserByFollowId() {
        return _conditionQueryUserByFollowId != null;
    }

    /**
     * Get the condition-query for relation table. <br />
     * user by my followed_id, named 'userByFollowedId'.
     * @return The instance of condition-query. (NotNull)
     */
    public UserCQ queryUserByFollowedId() {
        return getConditionQueryUserByFollowedId();
    }
    protected UserCQ _conditionQueryUserByFollowedId;
    public UserCQ getConditionQueryUserByFollowedId() {
        if (_conditionQueryUserByFollowedId == null) {
            _conditionQueryUserByFollowedId = xcreateQueryUserByFollowedId();
            xsetupOuterJoinUserByFollowedId();
        }
        return _conditionQueryUserByFollowedId;
    }
    protected UserCQ xcreateQueryUserByFollowedId() {
        String nrp = resolveNextRelationPath("relationship", "userByFollowedId");
        String jan = resolveJoinAliasName(nrp, xgetNextNestLevel());
        UserCQ cq = new UserCQ(this, xgetSqlClause(), jan, xgetNextNestLevel());
        cq.xsetBaseCB(_baseCB);
        cq.xsetForeignPropertyName("userByFollowedId");
        cq.xsetRelationPath(nrp); return cq;
    }
    protected void xsetupOuterJoinUserByFollowedId() {
        UserCQ cq = getConditionQueryUserByFollowedId();
        Map<String, String> joinOnMap = newLinkedHashMapSized(4);
        joinOnMap.put("followed_id", "id");
        registerOuterJoin(cq, joinOnMap, "userByFollowedId");
    }
    public boolean hasConditionQueryUserByFollowedId() {
        return _conditionQueryUserByFollowedId != null;
    }

    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    protected Map<String, RelationshipCQ> _scalarConditionMap;
    public Map<String, RelationshipCQ> getScalarCondition() { return _scalarConditionMap; }
    public String keepScalarCondition(RelationshipCQ subQuery) {
        if (_scalarConditionMap == null) { _scalarConditionMap = newLinkedHashMapSized(4); }
        String key = "subQueryMapKey" + (_scalarConditionMap.size() + 1);
        _scalarConditionMap.put(key, subQuery); return "scalarCondition." + key;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    protected Map<String, RelationshipCQ> _specifyMyselfDerivedMap;
    public Map<String, RelationshipCQ> getSpecifyMyselfDerived() { return _specifyMyselfDerivedMap; }
    public String keepSpecifyMyselfDerived(RelationshipCQ subQuery) {
        if (_specifyMyselfDerivedMap == null) { _specifyMyselfDerivedMap = newLinkedHashMapSized(4); }
        String key = "subQueryMapKey" + (_specifyMyselfDerivedMap.size() + 1);
        _specifyMyselfDerivedMap.put(key, subQuery); return "specifyMyselfDerived." + key;
    }

    protected Map<String, RelationshipCQ> _queryMyselfDerivedMap;
    public Map<String, RelationshipCQ> getQueryMyselfDerived() { return _queryMyselfDerivedMap; }
    public String keepQueryMyselfDerived(RelationshipCQ subQuery) {
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
    protected Map<String, RelationshipCQ> _myselfExistsMap;
    public Map<String, RelationshipCQ> getMyselfExists() { return _myselfExistsMap; }
    public String keepMyselfExists(RelationshipCQ subQuery) {
        if (_myselfExistsMap == null) { _myselfExistsMap = newLinkedHashMapSized(4); }
        String key = "subQueryMapKey" + (_myselfExistsMap.size() + 1);
        _myselfExistsMap.put(key, subQuery); return "myselfExists." + key;
    }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    protected Map<String, RelationshipCQ> _myselfInScopeMap;
    public Map<String, RelationshipCQ> getMyselfInScope() { return _myselfInScopeMap; }
    public String keepMyselfInScope(RelationshipCQ subQuery) {
        if (_myselfInScopeMap == null) { _myselfInScopeMap = newLinkedHashMapSized(4); }
        String key = "subQueryMapKey" + (_myselfInScopeMap.size() + 1);
        _myselfInScopeMap.put(key, subQuery); return "myselfInScope." + key;
    }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return RelationshipCB.class.getName(); }
    protected String xCQ() { return RelationshipCQ.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
