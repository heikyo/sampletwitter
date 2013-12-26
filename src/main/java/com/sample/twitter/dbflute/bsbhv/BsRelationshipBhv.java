package com.sample.twitter.dbflute.bsbhv;

import java.util.List;

import org.seasar.dbflute.*;
import org.seasar.dbflute.bhv.*;
import org.seasar.dbflute.cbean.*;
import org.seasar.dbflute.dbmeta.DBMeta;
import org.seasar.dbflute.outsidesql.executor.*;
import com.sample.twitter.dbflute.exbhv.*;
import com.sample.twitter.dbflute.exentity.*;
import com.sample.twitter.dbflute.bsentity.dbmeta.*;
import com.sample.twitter.dbflute.cbean.*;

/**
 * The behavior of relationship as TABLE. <br />
 * <pre>
 * [primary key]
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
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsRelationshipBhv extends AbstractBehaviorWritable {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                          Table name
    //                                                                          ==========
    /** @return The name on database of table. (NotNull) */
    public String getTableDbName() { return "relationship"; }

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    /** @return The instance of DBMeta. (NotNull) */
    public DBMeta getDBMeta() { return RelationshipDbm.getInstance(); }

    /** @return The instance of DBMeta as my table type. (NotNull) */
    public RelationshipDbm getMyDBMeta() { return RelationshipDbm.getInstance(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public Entity newEntity() { return newMyEntity(); }

    /** {@inheritDoc} */
    public ConditionBean newConditionBean() { return newMyConditionBean(); }

    /** @return The instance of new entity as my table type. (NotNull) */
    public Relationship newMyEntity() { return new Relationship(); }

    /** @return The instance of new condition-bean as my table type. (NotNull) */
    public RelationshipCB newMyConditionBean() { return new RelationshipCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br />
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * RelationshipCB cb = new RelationshipCB();
     * cb.query().setFoo...(value);
     * int count = relationshipBhv.<span style="color: #FD4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of Relationship. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(RelationshipCB cb) {
        return doSelectCountUniquely(cb);
    }

    protected int doSelectCountUniquely(RelationshipCB cb) { // called by selectCount(cb) 
        assertCBStateValid(cb);
        return delegateSelectCountUniquely(cb);
    }

    protected int doSelectCountPlainly(RelationshipCB cb) { // called by selectPage(cb)
        assertCBStateValid(cb);
        return delegateSelectCountPlainly(cb);
    }

    @Override
    protected int doReadCount(ConditionBean cb) {
        return selectCount(downcast(cb));
    }

    // ===================================================================================
    //                                                                       Entity Select
    //                                                                       =============
    /**
     * Select the entity by the condition-bean.
     * <pre>
     * RelationshipCB cb = new RelationshipCB();
     * cb.query().setFoo...(value);
     * Relationship relationship = relationshipBhv.<span style="color: #FD4747">selectEntity</span>(cb);
     * if (relationship != null) {
     *     ... = relationship.get...();
     * } else {
     *     ...
     * }
     * </pre>
     * @param cb The condition-bean of Relationship. (NotNull)
     * @return The entity selected by the condition. (NullAllowed: if no data, it returns null)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public Relationship selectEntity(RelationshipCB cb) {
        return doSelectEntity(cb, Relationship.class);
    }

    protected <ENTITY extends Relationship> ENTITY doSelectEntity(final RelationshipCB cb, Class<ENTITY> entityType) {
        assertCBStateValid(cb);
        return helpSelectEntityInternally(cb, entityType, new InternalSelectEntityCallback<ENTITY, RelationshipCB>() {
            public List<ENTITY> callbackSelectList(RelationshipCB cb, Class<ENTITY> entityType) { return doSelectList(cb, entityType); } });
    }

    @Override
    protected Entity doReadEntity(ConditionBean cb) {
        return selectEntity(downcast(cb));
    }

    /**
     * Select the entity by the condition-bean with deleted check.
     * <pre>
     * RelationshipCB cb = new RelationshipCB();
     * cb.query().setFoo...(value);
     * Relationship relationship = relationshipBhv.<span style="color: #FD4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = relationship.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of Relationship. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public Relationship selectEntityWithDeletedCheck(RelationshipCB cb) {
        return doSelectEntityWithDeletedCheck(cb, Relationship.class);
    }

    protected <ENTITY extends Relationship> ENTITY doSelectEntityWithDeletedCheck(final RelationshipCB cb, Class<ENTITY> entityType) {
        assertCBStateValid(cb);
        return helpSelectEntityWithDeletedCheckInternally(cb, entityType, new InternalSelectEntityWithDeletedCheckCallback<ENTITY, RelationshipCB>() {
            public List<ENTITY> callbackSelectList(RelationshipCB cb, Class<ENTITY> entityType) { return doSelectList(cb, entityType); } });
    }

    @Override
    protected Entity doReadEntityWithDeletedCheck(ConditionBean cb) {
        return selectEntityWithDeletedCheck(downcast(cb));
    }

    /**
     * Select the entity by the primary-key value.
     * @param id The one of primary key. (NotNull)
     * @return The entity selected by the PK. (NullAllowed: if no data, it returns null)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public Relationship selectByPKValue(Integer id) {
        return doSelectByPKValue(id, Relationship.class);
    }

    protected <ENTITY extends Relationship> ENTITY doSelectByPKValue(Integer id, Class<ENTITY> entityType) {
        return doSelectEntity(buildPKCB(id), entityType);
    }

    /**
     * Select the entity by the primary-key value with deleted check.
     * @param id The one of primary key. (NotNull)
     * @return The entity selected by the PK. (NotNull: if no data, throws exception)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public Relationship selectByPKValueWithDeletedCheck(Integer id) {
        return doSelectByPKValueWithDeletedCheck(id, Relationship.class);
    }

    protected <ENTITY extends Relationship> ENTITY doSelectByPKValueWithDeletedCheck(Integer id, Class<ENTITY> entityType) {
        return doSelectEntityWithDeletedCheck(buildPKCB(id), entityType);
    }

    private RelationshipCB buildPKCB(Integer id) {
        assertObjectNotNull("id", id);
        RelationshipCB cb = newMyConditionBean();
        cb.query().setId_Equal(id);
        return cb;
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * RelationshipCB cb = new RelationshipCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * ListResultBean&lt;Relationship&gt; relationshipList = relationshipBhv.<span style="color: #FD4747">selectList</span>(cb);
     * for (Relationship relationship : relationshipList) {
     *     ... = relationship.get...();
     * }
     * </pre>
     * @param cb The condition-bean of Relationship. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @exception org.seasar.dbflute.exception.DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<Relationship> selectList(RelationshipCB cb) {
        return doSelectList(cb, Relationship.class);
    }

    protected <ENTITY extends Relationship> ListResultBean<ENTITY> doSelectList(RelationshipCB cb, Class<ENTITY> entityType) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", entityType);
        assertSpecifyDerivedReferrerEntityProperty(cb, entityType);
        return helpSelectListInternally(cb, entityType, new InternalSelectListCallback<ENTITY, RelationshipCB>() {
            public List<ENTITY> callbackSelectList(RelationshipCB cb, Class<ENTITY> entityType) { return delegateSelectList(cb, entityType); } });
    }

    @Override
    protected ListResultBean<? extends Entity> doReadList(ConditionBean cb) {
        return selectList(downcast(cb));
    }

    // ===================================================================================
    //                                                                         Page Select
    //                                                                         ===========
    /**
     * Select the page as result bean. <br />
     * (both count-select and paging-select are executed)
     * <pre>
     * RelationshipCB cb = new RelationshipCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #FD4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;Relationship&gt; page = relationshipBhv.<span style="color: #FD4747">selectPage</span>(cb);
     * int allRecordCount = page.getAllRecordCount();
     * int allPageCount = page.getAllPageCount();
     * boolean isExistPrePage = page.isExistPrePage();
     * boolean isExistNextPage = page.isExistNextPage();
     * ...
     * for (Relationship relationship : page) {
     *     ... = relationship.get...();
     * }
     * </pre>
     * @param cb The condition-bean of Relationship. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @exception org.seasar.dbflute.exception.DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<Relationship> selectPage(RelationshipCB cb) {
        return doSelectPage(cb, Relationship.class);
    }

    protected <ENTITY extends Relationship> PagingResultBean<ENTITY> doSelectPage(RelationshipCB cb, Class<ENTITY> entityType) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", entityType);
        return helpSelectPageInternally(cb, entityType, new InternalSelectPageCallback<ENTITY, RelationshipCB>() {
            public int callbackSelectCount(RelationshipCB cb) { return doSelectCountPlainly(cb); }
            public List<ENTITY> callbackSelectList(RelationshipCB cb, Class<ENTITY> entityType) { return doSelectList(cb, entityType); }
        });
    }

    @Override
    protected PagingResultBean<? extends Entity> doReadPage(ConditionBean cb) {
        return selectPage(downcast(cb));
    }

    // ===================================================================================
    //                                                                       Cursor Select
    //                                                                       =============
    /**
     * Select the cursor by the condition-bean.
     * <pre>
     * RelationshipCB cb = new RelationshipCB();
     * cb.query().setFoo...(value);
     * relationshipBhv.<span style="color: #FD4747">selectCursor</span>(cb, new EntityRowHandler&lt;Relationship&gt;() {
     *     public void handle(Relationship entity) {
     *         ... = entity.getFoo...();
     *     }
     * });
     * </pre>
     * @param cb The condition-bean of Relationship. (NotNull)
     * @param entityRowHandler The handler of entity row of Relationship. (NotNull)
     */
    public void selectCursor(RelationshipCB cb, EntityRowHandler<Relationship> entityRowHandler) {
        doSelectCursor(cb, entityRowHandler, Relationship.class);
    }

    protected <ENTITY extends Relationship> void doSelectCursor(RelationshipCB cb, EntityRowHandler<ENTITY> entityRowHandler, Class<ENTITY> entityType) {
        assertCBStateValid(cb); assertObjectNotNull("entityRowHandler<Relationship>", entityRowHandler); assertObjectNotNull("entityType", entityType);
        assertSpecifyDerivedReferrerEntityProperty(cb, entityType);
        helpSelectCursorInternally(cb, entityRowHandler, entityType, new InternalSelectCursorCallback<ENTITY, RelationshipCB>() {
            public void callbackSelectCursor(RelationshipCB cb, EntityRowHandler<ENTITY> entityRowHandler, Class<ENTITY> entityType) { delegateSelectCursor(cb, entityRowHandler, entityType); }
            public List<ENTITY> callbackSelectList(RelationshipCB cb, Class<ENTITY> entityType) { return doSelectList(cb, entityType); }
        });
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br />
     * You should call a function method after this method called like as follows:
     * <pre>
     * relationshipBhv.<span style="color: #FD4747">scalarSelect</span>(Date.class).max(new ScalarQuery() {
     *     public void query(RelationshipCB cb) {
     *         cb.specify().<span style="color: #FD4747">columnFooDatetime()</span>; <span style="color: #3F7E5E">// required for a function</span>
     *         cb.query().setBarName_PrefixSearch("S");
     *     }
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar value derived by a function. (NullAllowed)
     */
    public <RESULT> SLFunction<RelationshipCB, RESULT> scalarSelect(Class<RESULT> resultType) {
        return doScalarSelect(resultType, newMyConditionBean());
    }

    protected <RESULT, CB extends RelationshipCB> SLFunction<CB, RESULT> doScalarSelect(Class<RESULT> resultType, CB cb) {
        assertObjectNotNull("resultType", resultType); assertCBStateValid(cb);
        cb.xsetupForScalarSelect(); cb.getSqlClause().disableSelectIndex(); // for when you use union
        return new SLFunction<CB, RESULT>(cb, resultType);
    }

    // ===================================================================================
    //                                                                            Sequence
    //                                                                            ========
    @Override
    protected Number doReadNextVal() {
        String msg = "This table is NOT related to sequence: " + getTableDbName();
        throw new UnsupportedOperationException(msg);
    }

    // ===================================================================================
    //                                                                   Pull out Relation
    //                                                                   =================
    /**
     * Pull out the list of foreign table 'User'.
     * @param relationshipList The list of relationship. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<User> pulloutUserByFollowId(List<Relationship> relationshipList) {
        return helpPulloutInternally(relationshipList, new InternalPulloutCallback<Relationship, User>() {
            public User getFr(Relationship e) { return e.getUserByFollowId(); }
            public boolean hasRf() { return true; }
            public void setRfLs(User e, List<Relationship> ls)
            { e.setRelationshipByFollowIdList(ls); }
        });
    }
    /**
     * Pull out the list of foreign table 'User'.
     * @param relationshipList The list of relationship. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<User> pulloutUserByFollowedId(List<Relationship> relationshipList) {
        return helpPulloutInternally(relationshipList, new InternalPulloutCallback<Relationship, User>() {
            public User getFr(Relationship e) { return e.getUserByFollowedId(); }
            public boolean hasRf() { return true; }
            public void setRfLs(User e, List<Relationship> ls)
            { e.setRelationshipByFollowedIdList(ls); }
        });
    }

    // ===================================================================================
    //                                                                      Extract Column
    //                                                                      ==============
    /**
     * Extract the value list of (single) primary key id.
     * @param relationshipList The list of relationship. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<Integer> extractIdList(List<Relationship> relationshipList) {
        return helpExtractListInternally(relationshipList, new InternalExtractCallback<Relationship, Integer>() {
            public Integer getCV(Relationship e) { return e.getId(); }
        });
    }

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity modified-only. (DefaultConstraintsEnabled)
     * <pre>
     * Relationship relationship = new Relationship();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * relationship.setFoo...(value);
     * relationship.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//relationship.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//relationship.set...;</span>
     * relationshipBhv.<span style="color: #FD4747">insert</span>(relationship);
     * ... = relationship.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param relationship The entity of insert target. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insert(Relationship relationship) {
        doInsert(relationship, null);
    }

    protected void doInsert(Relationship relationship, InsertOption<RelationshipCB> option) {
        assertObjectNotNull("relationship", relationship);
        prepareInsertOption(option);
        delegateInsert(relationship, option);
    }

    protected void prepareInsertOption(InsertOption<RelationshipCB> option) {
        if (option == null) { return; }
        assertInsertOptionStatus(option);
        if (option.hasSpecifiedInsertColumn()) {
            option.resolveInsertColumnSpecification(createCBForSpecifiedUpdate());
        }
    }

    @Override
    protected void doCreate(Entity entity, InsertOption<? extends ConditionBean> option) {
        if (option == null) { insert(downcast(entity)); }
        else { varyingInsert(downcast(entity), downcast(option)); }
    }

    /**
     * Update the entity modified-only. (ZeroUpdateException, NonExclusiveControl)
     * <pre>
     * Relationship relationship = new Relationship();
     * relationship.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * relationship.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//relationship.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//relationship.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * relationship.<span style="color: #FD4747">setVersionNo</span>(value);
     * try {
     *     relationshipBhv.<span style="color: #FD4747">update</span>(relationship);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * } 
     * </pre>
     * @param relationship The entity of update target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void update(final Relationship relationship) {
        doUpdate(relationship, null);
    }

    protected void doUpdate(Relationship relationship, final UpdateOption<RelationshipCB> option) {
        assertObjectNotNull("relationship", relationship);
        prepareUpdateOption(option);
        helpUpdateInternally(relationship, new InternalUpdateCallback<Relationship>() {
            public int callbackDelegateUpdate(Relationship entity) { return delegateUpdate(entity, option); } });
    }

    protected void prepareUpdateOption(UpdateOption<RelationshipCB> option) {
        if (option == null) { return; }
        assertUpdateOptionStatus(option);
        if (option.hasSelfSpecification()) {
            option.resolveSelfSpecification(createCBForVaryingUpdate());
        }
        if (option.hasSpecifiedUpdateColumn()) {
            option.resolveUpdateColumnSpecification(createCBForSpecifiedUpdate());
        }
    }

    protected RelationshipCB createCBForVaryingUpdate() {
        RelationshipCB cb = newMyConditionBean();
        cb.xsetupForVaryingUpdate();
        return cb;
    }

    protected RelationshipCB createCBForSpecifiedUpdate() {
        RelationshipCB cb = newMyConditionBean();
        cb.xsetupForSpecifiedUpdate();
        return cb;
    }

    @Override
    protected void doModify(Entity entity, UpdateOption<? extends ConditionBean> option) {
        if (option == null) { update(downcast(entity)); }
        else { varyingUpdate(downcast(entity), downcast(option)); }
    }

    @Override
    protected void doModifyNonstrict(Entity entity, UpdateOption<? extends ConditionBean> option) {
        doModify(entity, option);
    }

    /**
     * Insert or update the entity modified-only. (DefaultConstraintsEnabled, NonExclusiveControl) <br />
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() } <br />
     * <p><span style="color: #FD4747; font-size: 120%">Attention, you cannot update by unique keys instead of PK.</span></p>
     * @param relationship The entity of insert or update target. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdate(Relationship relationship) {
        doInesrtOrUpdate(relationship, null, null);
    }

    protected void doInesrtOrUpdate(Relationship relationship, final InsertOption<RelationshipCB> insertOption, final UpdateOption<RelationshipCB> updateOption) {
        helpInsertOrUpdateInternally(relationship, new InternalInsertOrUpdateCallback<Relationship, RelationshipCB>() {
            public void callbackInsert(Relationship entity) { doInsert(entity, insertOption); }
            public void callbackUpdate(Relationship entity) { doUpdate(entity, updateOption); }
            public RelationshipCB callbackNewMyConditionBean() { return newMyConditionBean(); }
            public int callbackSelectCount(RelationshipCB cb) { return selectCount(cb); }
        });
    }

    @Override
    protected void doCreateOrModify(Entity entity, InsertOption<? extends ConditionBean> insertOption,
            UpdateOption<? extends ConditionBean> updateOption) {
        if (insertOption == null && updateOption == null) { insertOrUpdate(downcast(entity)); }
        else {
            insertOption = insertOption == null ? new InsertOption<RelationshipCB>() : insertOption;
            updateOption = updateOption == null ? new UpdateOption<RelationshipCB>() : updateOption;
            varyingInsertOrUpdate(downcast(entity), downcast(insertOption), downcast(updateOption));
        }
    }

    @Override
    protected void doCreateOrModifyNonstrict(Entity entity, InsertOption<? extends ConditionBean> insertOption,
            UpdateOption<? extends ConditionBean> updateOption) {
        doCreateOrModify(entity, insertOption, updateOption);
    }

    /**
     * Delete the entity. (ZeroUpdateException, NonExclusiveControl)
     * <pre>
     * Relationship relationship = new Relationship();
     * relationship.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * relationship.<span style="color: #FD4747">setVersionNo</span>(value);
     * try {
     *     relationshipBhv.<span style="color: #FD4747">delete</span>(relationship);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * } 
     * </pre>
     * @param relationship The entity of delete target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(Relationship relationship) {
        doDelete(relationship, null);
    }

    protected void doDelete(Relationship relationship, final DeleteOption<RelationshipCB> option) {
        assertObjectNotNull("relationship", relationship);
        prepareDeleteOption(option);
        helpDeleteInternally(relationship, new InternalDeleteCallback<Relationship>() {
            public int callbackDelegateDelete(Relationship entity) { return delegateDelete(entity, option); } });
    }

    protected void prepareDeleteOption(DeleteOption<RelationshipCB> option) {
        if (option == null) { return; }
        assertDeleteOptionStatus(option);
    }

    @Override
    protected void doRemove(Entity entity, DeleteOption<? extends ConditionBean> option) {
        if (option == null) { delete(downcast(entity)); }
        else { varyingDelete(downcast(entity), downcast(option)); }
    }

    @Override
    protected void doRemoveNonstrict(Entity entity, DeleteOption<? extends ConditionBean> option) {
        doRemove(entity, option);
    }

    // ===================================================================================
    //                                                                        Batch Update
    //                                                                        ============
    /**
     * Batch-insert the entity list modified-only of same-set columns. (DefaultConstraintsEnabled) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement. <br />
     * <p><span style="color: #FD4747; font-size: 120%">The columns of least common multiple are registered like this:</span></p>
     * <pre>
     * for (... : ...) {
     *     Relationship relationship = new Relationship();
     *     relationship.setFooName("foo");
     *     if (...) {
     *         relationship.setFooPrice(123);
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are registered</span>
     *     <span style="color: #3F7E5E">// FOO_PRICE not-called in any entities are registered as null without default value</span>
     *     <span style="color: #3F7E5E">// columns not-called in all entities are registered as null or default value</span>
     *     relationshipList.add(relationship);
     * }
     * relationshipBhv.<span style="color: #FD4747">batchInsert</span>(relationshipList);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param relationshipList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    public int[] batchInsert(List<Relationship> relationshipList) {
        InsertOption<RelationshipCB> option = createInsertUpdateOption();
        return doBatchInsert(relationshipList, option);
    }

    protected int[] doBatchInsert(List<Relationship> relationshipList, InsertOption<RelationshipCB> option) {
        assertObjectNotNull("relationshipList", relationshipList);
        prepareBatchInsertOption(relationshipList, option);
        return delegateBatchInsert(relationshipList, option);
    }

    protected void prepareBatchInsertOption(List<Relationship> relationshipList, InsertOption<RelationshipCB> option) {
        option.xallowInsertColumnModifiedPropertiesFragmented();
        option.xacceptInsertColumnModifiedPropertiesIfNeeds(relationshipList);
        prepareInsertOption(option);
    }

    @Override
    protected int[] doLumpCreate(List<Entity> ls, InsertOption<? extends ConditionBean> option) {
        if (option == null) { return batchInsert(downcast(ls)); }
        else { return varyingBatchInsert(downcast(ls), downcast(option)); }
    }

    /**
     * Batch-update the entity list modified-only of same-set columns. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement. <br />
     * <span style="color: #FD4747; font-size: 120%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * for (... : ...) {
     *     Relationship relationship = new Relationship();
     *     relationship.setFooName("foo");
     *     if (...) {
     *         relationship.setFooPrice(123);
     *     } else {
     *         relationship.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//relationship.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     relationshipList.add(relationship);
     * }
     * relationshipBhv.<span style="color: #FD4747">batchUpdate</span>(relationshipList);
     * </pre>
     * @param relationshipList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(List<Relationship> relationshipList) {
        UpdateOption<RelationshipCB> option = createPlainUpdateOption();
        return doBatchUpdate(relationshipList, option);
    }

    protected int[] doBatchUpdate(List<Relationship> relationshipList, UpdateOption<RelationshipCB> option) {
        assertObjectNotNull("relationshipList", relationshipList);
        prepareBatchUpdateOption(relationshipList, option);
        return delegateBatchUpdate(relationshipList, option);
    }

    protected void prepareBatchUpdateOption(List<Relationship> relationshipList, UpdateOption<RelationshipCB> option) {
        option.xacceptUpdateColumnModifiedPropertiesIfNeeds(relationshipList);
        prepareUpdateOption(option);
    }

    @Override
    protected int[] doLumpModify(List<Entity> ls, UpdateOption<? extends ConditionBean> option) {
        if (option == null) { return batchUpdate(downcast(ls)); }
        else { return varyingBatchUpdate(downcast(ls), downcast(option)); }
    }

    /**
     * Batch-update the entity list specified-only. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * <pre>
     * <span style="color: #3F7E5E">// e.g. update two columns only</span> 
     * relationshipBhv.<span style="color: #FD4747">batchUpdate</span>(relationshipList, new SpecifyQuery<RelationshipCB>() {
     *     public void specify(RelationshipCB cb) { <span style="color: #3F7E5E">// the two only updated</span>
     *         cb.specify().<span style="color: #FD4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *         cb.specify().<span style="color: #FD4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     }
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span> 
     * relationshipBhv.<span style="color: #FD4747">batchUpdate</span>(relationshipList, new SpecifyQuery<RelationshipCB>() {
     *     public void specify(RelationshipCB cb) { <span style="color: #3F7E5E">// all columns are updated</span>
     *         cb.specify().<span style="color: #FD4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     *     }
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).
     * But if you specify every column, it has no check.</p>
     * @param relationshipList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param updateColumnSpec The specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(List<Relationship> relationshipList, SpecifyQuery<RelationshipCB> updateColumnSpec) {
        return doBatchUpdate(relationshipList, createSpecifiedUpdateOption(updateColumnSpec));
    }

    @Override
    protected int[] doLumpModifyNonstrict(List<Entity> ls, UpdateOption<? extends ConditionBean> option) {
        return doLumpModify(ls, option);
    }

    /**
     * Batch-delete the entity list. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param relationshipList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchDelete(List<Relationship> relationshipList) {
        return doBatchDelete(relationshipList, null);
    }

    protected int[] doBatchDelete(List<Relationship> relationshipList, DeleteOption<RelationshipCB> option) {
        assertObjectNotNull("relationshipList", relationshipList);
        prepareDeleteOption(option);
        return delegateBatchDelete(relationshipList, option);
    }

    @Override
    protected int[] doLumpRemove(List<Entity> ls, DeleteOption<? extends ConditionBean> option) {
        if (option == null) { return batchDelete(downcast(ls)); }
        else { return varyingBatchDelete(downcast(ls), downcast(option)); }
    }

    @Override
    protected int[] doLumpRemoveNonstrict(List<Entity> ls, DeleteOption<? extends ConditionBean> option) {
        return doLumpRemove(ls, option);
    }

    // ===================================================================================
    //                                                                        Query Update
    //                                                                        ============
    /**
     * Insert the several entities by query (modified-only for fixed value).
     * <pre>
     * relationshipBhv.<span style="color: #FD4747">queryInsert</span>(new QueryInsertSetupper&lt;Relationship, RelationshipCB&gt;() {
     *     public ConditionBean setup(relationship entity, RelationshipCB intoCB) {
     *         FooCB cb = FooCB();
     *         cb.setupSelect_Bar();
     * 
     *         <span style="color: #3F7E5E">// mapping</span>
     *         intoCB.specify().columnMyName().mappedFrom(cb.specify().columnFooName());
     *         intoCB.specify().columnMyCount().mappedFrom(cb.specify().columnFooCount());
     *         intoCB.specify().columnMyDate().mappedFrom(cb.specify().specifyBar().columnBarDate());
     *         entity.setMyFixedValue("foo"); <span style="color: #3F7E5E">// fixed value</span>
     *         <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     *         <span style="color: #3F7E5E">//entity.setRegisterUser(value);</span>
     *         <span style="color: #3F7E5E">//entity.set...;</span>
     *         <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     *         <span style="color: #3F7E5E">//entity.setVersionNo(value);</span>
     * 
     *         return cb;
     *     }
     * });
     * </pre>
     * @param setupper The setup-per of query-insert. (NotNull)
     * @return The inserted count.
     */
    public int queryInsert(QueryInsertSetupper<Relationship, RelationshipCB> setupper) {
        return doQueryInsert(setupper, null);
    }

    protected int doQueryInsert(QueryInsertSetupper<Relationship, RelationshipCB> setupper, InsertOption<RelationshipCB> option) {
        assertObjectNotNull("setupper", setupper);
        prepareInsertOption(option);
        Relationship entity = new Relationship();
        RelationshipCB intoCB = createCBForQueryInsert();
        ConditionBean resourceCB = setupper.setup(entity, intoCB);
        return delegateQueryInsert(entity, intoCB, resourceCB, option);
    }

    protected RelationshipCB createCBForQueryInsert() {
        RelationshipCB cb = newMyConditionBean();
        cb.xsetupForQueryInsert();
        return cb;
    }

    @Override
    protected int doRangeCreate(QueryInsertSetupper<? extends Entity, ? extends ConditionBean> setupper, InsertOption<? extends ConditionBean> option) {
        if (option == null) { return queryInsert(downcast(setupper)); }
        else { return varyingQueryInsert(downcast(setupper), downcast(option)); }
    }

    /**
     * Update the several entities by query non-strictly modified-only. (NonExclusiveControl)
     * <pre>
     * Relationship relationship = new Relationship();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//relationship.setPK...(value);</span>
     * relationship.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//relationship.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//relationship.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//relationship.setVersionNo(value);</span>
     * RelationshipCB cb = new RelationshipCB();
     * cb.query().setFoo...(value);
     * relationshipBhv.<span style="color: #FD4747">queryUpdate</span>(relationship, cb);
     * </pre>
     * @param relationship The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cb The condition-bean of Relationship. (NotNull)
     * @return The updated count.
     * @exception org.seasar.dbflute.exception.NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(Relationship relationship, RelationshipCB cb) {
        return doQueryUpdate(relationship, cb, null);
    }

    protected int doQueryUpdate(Relationship relationship, RelationshipCB cb, UpdateOption<RelationshipCB> option) {
        assertObjectNotNull("relationship", relationship); assertCBStateValid(cb);
        prepareUpdateOption(option);
        return checkCountBeforeQueryUpdateIfNeeds(cb) ? delegateQueryUpdate(relationship, cb, option) : 0;
    }

    @Override
    protected int doRangeModify(Entity entity, ConditionBean cb, UpdateOption<? extends ConditionBean> option) {
        if (option == null) { return queryUpdate(downcast(entity), (RelationshipCB)cb); }
        else { return varyingQueryUpdate(downcast(entity), (RelationshipCB)cb, downcast(option)); }
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * RelationshipCB cb = new RelationshipCB();
     * cb.query().setFoo...(value);
     * relationshipBhv.<span style="color: #FD4747">queryDelete</span>(relationship, cb);
     * </pre>
     * @param cb The condition-bean of Relationship. (NotNull)
     * @return The deleted count.
     * @exception org.seasar.dbflute.exception.NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(RelationshipCB cb) {
        return doQueryDelete(cb, null);
    }

    protected int doQueryDelete(RelationshipCB cb, DeleteOption<RelationshipCB> option) {
        assertCBStateValid(cb);
        prepareDeleteOption(option);
        return checkCountBeforeQueryUpdateIfNeeds(cb) ? delegateQueryDelete(cb, option) : 0;
    }

    @Override
    protected int doRangeRemove(ConditionBean cb, DeleteOption<? extends ConditionBean> option) {
        if (option == null) { return queryDelete((RelationshipCB)cb); }
        else { return varyingQueryDelete((RelationshipCB)cb, downcast(option)); }
    }

    // ===================================================================================
    //                                                                      Varying Update
    //                                                                      ==============
    // -----------------------------------------------------
    //                                         Entity Update
    //                                         -------------
    /**
     * Insert the entity with varying requests. <br />
     * For example, disableCommonColumnAutoSetup(), disablePrimaryKeyIdentity(). <br />
     * Other specifications are same as insert(entity).
     * <pre>
     * Relationship relationship = new Relationship();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * relationship.setFoo...(value);
     * relationship.setBar...(value);
     * InsertOption<RelationshipCB> option = new InsertOption<RelationshipCB>();
     * <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     * option.disableCommonColumnAutoSetup();
     * relationshipBhv.<span style="color: #FD4747">varyingInsert</span>(relationship, option);
     * ... = relationship.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param relationship The entity of insert target. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param option The option of insert for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsert(Relationship relationship, InsertOption<RelationshipCB> option) {
        assertInsertOptionNotNull(option);
        doInsert(relationship, option);
    }

    /**
     * Update the entity with varying requests modified-only. (ZeroUpdateException, NonExclusiveControl) <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br />
     * Other specifications are same as update(entity).
     * <pre>
     * Relationship relationship = new Relationship();
     * relationship.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * relationship.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * relationship.<span style="color: #FD4747">setVersionNo</span>(value);
     * try {
     *     <span style="color: #3F7E5E">// you can update by self calculation values</span>
     *     UpdateOption&lt;RelationshipCB&gt; option = new UpdateOption&lt;RelationshipCB&gt;();
     *     option.self(new SpecifyQuery&lt;RelationshipCB&gt;() {
     *         public void specify(RelationshipCB cb) {
     *             cb.specify().<span style="color: #FD4747">columnXxxCount()</span>;
     *         }
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     *     relationshipBhv.<span style="color: #FD4747">varyingUpdate</span>(relationship, option);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param relationship The entity of update target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @param option The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdate(Relationship relationship, UpdateOption<RelationshipCB> option) {
        assertUpdateOptionNotNull(option);
        doUpdate(relationship, option);
    }

    /**
     * Insert or update the entity with varying requests. (ExclusiveControl: when update) <br />
     * Other specifications are same as insertOrUpdate(entity).
     * @param relationship The entity of insert or update target. (NotNull)
     * @param insertOption The option of insert for varying requests. (NotNull)
     * @param updateOption The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdate(Relationship relationship, InsertOption<RelationshipCB> insertOption, UpdateOption<RelationshipCB> updateOption) {
        assertInsertOptionNotNull(insertOption); assertUpdateOptionNotNull(updateOption);
        doInesrtOrUpdate(relationship, insertOption, updateOption);
    }

    /**
     * Delete the entity with varying requests. (ZeroUpdateException, NonExclusiveControl) <br />
     * Now a valid option does not exist. <br />
     * Other specifications are same as delete(entity).
     * @param relationship The entity of delete target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @param option The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(Relationship relationship, DeleteOption<RelationshipCB> option) {
        assertDeleteOptionNotNull(option);
        doDelete(relationship, option);
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br />
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br />
     * Other specifications are same as batchInsert(entityList).
     * @param relationshipList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of insert for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchInsert(List<Relationship> relationshipList, InsertOption<RelationshipCB> option) {
        assertInsertOptionNotNull(option);
        return doBatchInsert(relationshipList, option);
    }

    /**
     * Batch-update the list with varying requests. <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br />
     * Other specifications are same as batchUpdate(entityList).
     * @param relationshipList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdate(List<Relationship> relationshipList, UpdateOption<RelationshipCB> option) {
        assertUpdateOptionNotNull(option);
        return doBatchUpdate(relationshipList, option);
    }

    /**
     * Batch-delete the list with varying requests. <br />
     * For example, limitBatchDeleteLogging(). <br />
     * Other specifications are same as batchDelete(entityList).
     * @param relationshipList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDelete(List<Relationship> relationshipList, DeleteOption<RelationshipCB> option) {
        assertDeleteOptionNotNull(option);
        return doBatchDelete(relationshipList, option);
    }

    // -----------------------------------------------------
    //                                          Query Update
    //                                          ------------
    /**
     * Insert the several entities by query with varying requests (modified-only for fixed value). <br />
     * For example, disableCommonColumnAutoSetup(), disablePrimaryKeyIdentity(). <br />
     * Other specifications are same as queryInsert(entity, setupper). 
     * @param setupper The setup-per of query-insert. (NotNull)
     * @param option The option of insert for varying requests. (NotNull)
     * @return The inserted count.
     */
    public int varyingQueryInsert(QueryInsertSetupper<Relationship, RelationshipCB> setupper, InsertOption<RelationshipCB> option) {
        assertInsertOptionNotNull(option);
        return doQueryInsert(setupper, option);
    }

    /**
     * Update the several entities by query with varying requests non-strictly modified-only. {NonExclusiveControl} <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), allowNonQueryUpdate(). <br />
     * Other specifications are same as queryUpdate(entity, cb). 
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * Relationship relationship = new Relationship();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//relationship.setPK...(value);</span>
     * relationship.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//relationship.setVersionNo(value);</span>
     * RelationshipCB cb = new RelationshipCB();
     * cb.query().setFoo...(value);
     * UpdateOption&lt;RelationshipCB&gt; option = new UpdateOption&lt;RelationshipCB&gt;();
     * option.self(new SpecifyQuery&lt;RelationshipCB&gt;() {
     *     public void specify(RelationshipCB cb) {
     *         cb.specify().<span style="color: #FD4747">columnFooCount()</span>;
     *     }
     * }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * relationshipBhv.<span style="color: #FD4747">varyingQueryUpdate</span>(relationship, cb, option);
     * </pre>
     * @param relationship The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cb The condition-bean of Relationship. (NotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The updated count.
     * @exception org.seasar.dbflute.exception.NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(Relationship relationship, RelationshipCB cb, UpdateOption<RelationshipCB> option) {
        assertUpdateOptionNotNull(option);
        return doQueryUpdate(relationship, cb, option);
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br />
     * For example, allowNonQueryDelete(). <br />
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param cb The condition-bean of Relationship. (NotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @exception org.seasar.dbflute.exception.NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(RelationshipCB cb, DeleteOption<RelationshipCB> option) {
        assertDeleteOptionNotNull(option);
        return doQueryDelete(cb, option);
    }

    // ===================================================================================
    //                                                                          OutsideSql
    //                                                                          ==========
    /**
     * Prepare the basic executor of outside-SQL to execute it. <br />
     * The invoker of behavior command should be not null when you call this method.
     * <pre>
     * You can use the methods for outside-SQL are as follows:
     * {Basic}
     *   o selectList()
     *   o execute()
     *   o call()
     * 
     * {Entity}
     *   o entityHandling().selectEntity()
     *   o entityHandling().selectEntityWithDeletedCheck()
     * 
     * {Paging}
     *   o autoPaging().selectList()
     *   o autoPaging().selectPage()
     *   o manualPaging().selectList()
     *   o manualPaging().selectPage()
     * 
     * {Cursor}
     *   o cursorHandling().selectCursor()
     * 
     * {Option}
     *   o dynamicBinding().selectList()
     *   o removeBlockComment().selectList()
     *   o removeLineComment().selectList()
     *   o formatSql().selectList()
     * </pre>
     * @return The basic executor of outside-SQL. (NotNull) 
     */
    public OutsideSqlBasicExecutor<RelationshipBhv> outsideSql() {
        return doOutsideSql();
    }

    // ===================================================================================
    //                                                                     Delegate Method
    //                                                                     ===============
    // [Behavior Command]
    // -----------------------------------------------------
    //                                                Select
    //                                                ------
    protected int delegateSelectCountUniquely(RelationshipCB cb) { return invoke(createSelectCountCBCommand(cb, true)); }
    protected int delegateSelectCountPlainly(RelationshipCB cb) { return invoke(createSelectCountCBCommand(cb, false)); }
    protected <ENTITY extends Relationship> void delegateSelectCursor(RelationshipCB cb, EntityRowHandler<ENTITY> erh, Class<ENTITY> et)
    { invoke(createSelectCursorCBCommand(cb, erh, et)); }
    protected <ENTITY extends Relationship> List<ENTITY> delegateSelectList(RelationshipCB cb, Class<ENTITY> et)
    { return invoke(createSelectListCBCommand(cb, et)); }

    // -----------------------------------------------------
    //                                                Update
    //                                                ------
    protected int delegateInsert(Relationship e, InsertOption<RelationshipCB> op)
    { if (!processBeforeInsert(e, op)) { return 0; }
      return invoke(createInsertEntityCommand(e, op)); }
    protected int delegateUpdate(Relationship e, UpdateOption<RelationshipCB> op)
    { if (!processBeforeUpdate(e, op)) { return 0; }
      return delegateUpdateNonstrict(e, op); }
    protected int delegateUpdateNonstrict(Relationship e, UpdateOption<RelationshipCB> op)
    { if (!processBeforeUpdate(e, op)) { return 0; }
      return invoke(createUpdateNonstrictEntityCommand(e, op)); }
    protected int delegateDelete(Relationship e, DeleteOption<RelationshipCB> op)
    { if (!processBeforeDelete(e, op)) { return 0; }
      return delegateDeleteNonstrict(e, op); }
    protected int delegateDeleteNonstrict(Relationship e, DeleteOption<RelationshipCB> op)
    { if (!processBeforeDelete(e, op)) { return 0; }
      return invoke(createDeleteNonstrictEntityCommand(e, op)); }

    protected int[] delegateBatchInsert(List<Relationship> ls, InsertOption<RelationshipCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchInsertCommand(processBatchInternally(ls, op), op)); }
    protected int[] delegateBatchUpdate(List<Relationship> ls, UpdateOption<RelationshipCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return delegateBatchUpdateNonstrict(ls, op); }
    protected int[] delegateBatchUpdateNonstrict(List<Relationship> ls, UpdateOption<RelationshipCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchUpdateNonstrictCommand(processBatchInternally(ls, op, true), op)); }
    protected int[] delegateBatchDelete(List<Relationship> ls, DeleteOption<RelationshipCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return delegateBatchDeleteNonstrict(ls, op); }
    protected int[] delegateBatchDeleteNonstrict(List<Relationship> ls, DeleteOption<RelationshipCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchDeleteNonstrictCommand(processBatchInternally(ls, op, true), op)); }

    protected int delegateQueryInsert(Relationship e, RelationshipCB inCB, ConditionBean resCB, InsertOption<RelationshipCB> op)
    { if (!processBeforeQueryInsert(e, inCB, resCB, op)) { return 0; } return invoke(createQueryInsertCBCommand(e, inCB, resCB, op));  }
    protected int delegateQueryUpdate(Relationship e, RelationshipCB cb, UpdateOption<RelationshipCB> op)
    { if (!processBeforeQueryUpdate(e, cb, op)) { return 0; } return invoke(createQueryUpdateCBCommand(e, cb, op));  }
    protected int delegateQueryDelete(RelationshipCB cb, DeleteOption<RelationshipCB> op)
    { if (!processBeforeQueryDelete(cb, op)) { return 0; } return invoke(createQueryDeleteCBCommand(cb, op));  }

    // ===================================================================================
    //                                                                Optimistic Lock Info
    //                                                                ====================
    /**
     * {@inheritDoc}
     */
    @Override
    protected boolean hasVersionNoValue(Entity entity) {
        return false;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected boolean hasUpdateDateValue(Entity entity) {
        return false;
    }

    // ===================================================================================
    //                                                                     Downcast Helper
    //                                                                     ===============
    protected Relationship downcast(Entity entity) {
        return helpEntityDowncastInternally(entity, Relationship.class);
    }

    protected RelationshipCB downcast(ConditionBean cb) {
        return helpConditionBeanDowncastInternally(cb, RelationshipCB.class);
    }

    @SuppressWarnings("unchecked")
    protected List<Relationship> downcast(List<? extends Entity> entityList) {
        return (List<Relationship>)entityList;
    }

    @SuppressWarnings("unchecked")
    protected InsertOption<RelationshipCB> downcast(InsertOption<? extends ConditionBean> option) {
        return (InsertOption<RelationshipCB>)option;
    }

    @SuppressWarnings("unchecked")
    protected UpdateOption<RelationshipCB> downcast(UpdateOption<? extends ConditionBean> option) {
        return (UpdateOption<RelationshipCB>)option;
    }

    @SuppressWarnings("unchecked")
    protected DeleteOption<RelationshipCB> downcast(DeleteOption<? extends ConditionBean> option) {
        return (DeleteOption<RelationshipCB>)option;
    }

    @SuppressWarnings("unchecked")
    protected QueryInsertSetupper<Relationship, RelationshipCB> downcast(QueryInsertSetupper<? extends Entity, ? extends ConditionBean> option) {
        return (QueryInsertSetupper<Relationship, RelationshipCB>)option;
    }
}
