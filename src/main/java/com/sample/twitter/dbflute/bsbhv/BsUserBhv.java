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
 * The behavior of user as TABLE. <br />
 * <pre>
 * [primary key]
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
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsUserBhv extends AbstractBehaviorWritable {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                          Table name
    //                                                                          ==========
    /** @return The name on database of table. (NotNull) */
    public String getTableDbName() { return "user"; }

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    /** @return The instance of DBMeta. (NotNull) */
    public DBMeta getDBMeta() { return UserDbm.getInstance(); }

    /** @return The instance of DBMeta as my table type. (NotNull) */
    public UserDbm getMyDBMeta() { return UserDbm.getInstance(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public Entity newEntity() { return newMyEntity(); }

    /** {@inheritDoc} */
    public ConditionBean newConditionBean() { return newMyConditionBean(); }

    /** @return The instance of new entity as my table type. (NotNull) */
    public User newMyEntity() { return new User(); }

    /** @return The instance of new condition-bean as my table type. (NotNull) */
    public UserCB newMyConditionBean() { return new UserCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br />
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * UserCB cb = new UserCB();
     * cb.query().setFoo...(value);
     * int count = userBhv.<span style="color: #FD4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of User. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(UserCB cb) {
        return doSelectCountUniquely(cb);
    }

    protected int doSelectCountUniquely(UserCB cb) { // called by selectCount(cb) 
        assertCBStateValid(cb);
        return delegateSelectCountUniquely(cb);
    }

    protected int doSelectCountPlainly(UserCB cb) { // called by selectPage(cb)
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
     * UserCB cb = new UserCB();
     * cb.query().setFoo...(value);
     * User user = userBhv.<span style="color: #FD4747">selectEntity</span>(cb);
     * if (user != null) {
     *     ... = user.get...();
     * } else {
     *     ...
     * }
     * </pre>
     * @param cb The condition-bean of User. (NotNull)
     * @return The entity selected by the condition. (NullAllowed: if no data, it returns null)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public User selectEntity(UserCB cb) {
        return doSelectEntity(cb, User.class);
    }

    protected <ENTITY extends User> ENTITY doSelectEntity(final UserCB cb, Class<ENTITY> entityType) {
        assertCBStateValid(cb);
        return helpSelectEntityInternally(cb, entityType, new InternalSelectEntityCallback<ENTITY, UserCB>() {
            public List<ENTITY> callbackSelectList(UserCB cb, Class<ENTITY> entityType) { return doSelectList(cb, entityType); } });
    }

    @Override
    protected Entity doReadEntity(ConditionBean cb) {
        return selectEntity(downcast(cb));
    }

    /**
     * Select the entity by the condition-bean with deleted check.
     * <pre>
     * UserCB cb = new UserCB();
     * cb.query().setFoo...(value);
     * User user = userBhv.<span style="color: #FD4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = user.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of User. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public User selectEntityWithDeletedCheck(UserCB cb) {
        return doSelectEntityWithDeletedCheck(cb, User.class);
    }

    protected <ENTITY extends User> ENTITY doSelectEntityWithDeletedCheck(final UserCB cb, Class<ENTITY> entityType) {
        assertCBStateValid(cb);
        return helpSelectEntityWithDeletedCheckInternally(cb, entityType, new InternalSelectEntityWithDeletedCheckCallback<ENTITY, UserCB>() {
            public List<ENTITY> callbackSelectList(UserCB cb, Class<ENTITY> entityType) { return doSelectList(cb, entityType); } });
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
    public User selectByPKValue(Integer id) {
        return doSelectByPKValue(id, User.class);
    }

    protected <ENTITY extends User> ENTITY doSelectByPKValue(Integer id, Class<ENTITY> entityType) {
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
    public User selectByPKValueWithDeletedCheck(Integer id) {
        return doSelectByPKValueWithDeletedCheck(id, User.class);
    }

    protected <ENTITY extends User> ENTITY doSelectByPKValueWithDeletedCheck(Integer id, Class<ENTITY> entityType) {
        return doSelectEntityWithDeletedCheck(buildPKCB(id), entityType);
    }

    private UserCB buildPKCB(Integer id) {
        assertObjectNotNull("id", id);
        UserCB cb = newMyConditionBean();
        cb.query().setId_Equal(id);
        return cb;
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * UserCB cb = new UserCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * ListResultBean&lt;User&gt; userList = userBhv.<span style="color: #FD4747">selectList</span>(cb);
     * for (User user : userList) {
     *     ... = user.get...();
     * }
     * </pre>
     * @param cb The condition-bean of User. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @exception org.seasar.dbflute.exception.DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<User> selectList(UserCB cb) {
        return doSelectList(cb, User.class);
    }

    protected <ENTITY extends User> ListResultBean<ENTITY> doSelectList(UserCB cb, Class<ENTITY> entityType) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", entityType);
        assertSpecifyDerivedReferrerEntityProperty(cb, entityType);
        return helpSelectListInternally(cb, entityType, new InternalSelectListCallback<ENTITY, UserCB>() {
            public List<ENTITY> callbackSelectList(UserCB cb, Class<ENTITY> entityType) { return delegateSelectList(cb, entityType); } });
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
     * UserCB cb = new UserCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #FD4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;User&gt; page = userBhv.<span style="color: #FD4747">selectPage</span>(cb);
     * int allRecordCount = page.getAllRecordCount();
     * int allPageCount = page.getAllPageCount();
     * boolean isExistPrePage = page.isExistPrePage();
     * boolean isExistNextPage = page.isExistNextPage();
     * ...
     * for (User user : page) {
     *     ... = user.get...();
     * }
     * </pre>
     * @param cb The condition-bean of User. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @exception org.seasar.dbflute.exception.DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<User> selectPage(UserCB cb) {
        return doSelectPage(cb, User.class);
    }

    protected <ENTITY extends User> PagingResultBean<ENTITY> doSelectPage(UserCB cb, Class<ENTITY> entityType) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", entityType);
        return helpSelectPageInternally(cb, entityType, new InternalSelectPageCallback<ENTITY, UserCB>() {
            public int callbackSelectCount(UserCB cb) { return doSelectCountPlainly(cb); }
            public List<ENTITY> callbackSelectList(UserCB cb, Class<ENTITY> entityType) { return doSelectList(cb, entityType); }
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
     * UserCB cb = new UserCB();
     * cb.query().setFoo...(value);
     * userBhv.<span style="color: #FD4747">selectCursor</span>(cb, new EntityRowHandler&lt;User&gt;() {
     *     public void handle(User entity) {
     *         ... = entity.getFoo...();
     *     }
     * });
     * </pre>
     * @param cb The condition-bean of User. (NotNull)
     * @param entityRowHandler The handler of entity row of User. (NotNull)
     */
    public void selectCursor(UserCB cb, EntityRowHandler<User> entityRowHandler) {
        doSelectCursor(cb, entityRowHandler, User.class);
    }

    protected <ENTITY extends User> void doSelectCursor(UserCB cb, EntityRowHandler<ENTITY> entityRowHandler, Class<ENTITY> entityType) {
        assertCBStateValid(cb); assertObjectNotNull("entityRowHandler<User>", entityRowHandler); assertObjectNotNull("entityType", entityType);
        assertSpecifyDerivedReferrerEntityProperty(cb, entityType);
        helpSelectCursorInternally(cb, entityRowHandler, entityType, new InternalSelectCursorCallback<ENTITY, UserCB>() {
            public void callbackSelectCursor(UserCB cb, EntityRowHandler<ENTITY> entityRowHandler, Class<ENTITY> entityType) { delegateSelectCursor(cb, entityRowHandler, entityType); }
            public List<ENTITY> callbackSelectList(UserCB cb, Class<ENTITY> entityType) { return doSelectList(cb, entityType); }
        });
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br />
     * You should call a function method after this method called like as follows:
     * <pre>
     * userBhv.<span style="color: #FD4747">scalarSelect</span>(Date.class).max(new ScalarQuery() {
     *     public void query(UserCB cb) {
     *         cb.specify().<span style="color: #FD4747">columnFooDatetime()</span>; <span style="color: #3F7E5E">// required for a function</span>
     *         cb.query().setBarName_PrefixSearch("S");
     *     }
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar value derived by a function. (NullAllowed)
     */
    public <RESULT> SLFunction<UserCB, RESULT> scalarSelect(Class<RESULT> resultType) {
        return doScalarSelect(resultType, newMyConditionBean());
    }

    protected <RESULT, CB extends UserCB> SLFunction<CB, RESULT> doScalarSelect(Class<RESULT> resultType, CB cb) {
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
    //                                                                       Load Referrer
    //                                                                       =============
    /**
     * {Refer to overload method that has an argument of the list of entity.}
     * @param user The entity of user. (NotNull)
     * @param conditionBeanSetupper The instance of referrer condition-bean set-upper for registering referrer condition. (NotNull)
     */
    public void loadRelationshipByFollowIdList(User user, ConditionBeanSetupper<RelationshipCB> conditionBeanSetupper) {
        xassLRArg(user, conditionBeanSetupper);
        loadRelationshipByFollowIdList(xnewLRLs(user), conditionBeanSetupper);
    }
    /**
     * Load referrer of relationshipByFollowIdList with the set-upper for condition-bean of referrer. <br />
     * relationship by follow_id, named 'relationshipByFollowIdList'.
     * <pre>
     * userBhv.<span style="color: #FD4747">loadRelationshipByFollowIdList</span>(userList, new ConditionBeanSetupper&lt;RelationshipCB&gt;() {
     *     public void setup(RelationshipCB cb) {
     *         cb.setupSelect...();
     *         cb.query().setFoo...(value);
     *         cb.query().addOrderBy_Bar...(); <span style="color: #3F7E5E">// basically you should order referrer list</span>
     *     }
     * });
     * for (User user : userList) {
     *     ... = user.<span style="color: #FD4747">getRelationshipByFollowIdList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key(and others too) is treated as case-insensitive. <br />
     * The condition-bean that the set-upper provides have settings before you touch it. It is as follows:
     * <pre>
     * cb.query().setFollowId_InScope(pkList);
     * cb.query().addOrderBy_FollowId_Asc();
     * </pre>
     * @param userList The entity list of user. (NotNull)
     * @param conditionBeanSetupper The instance of referrer condition-bean set-upper for registering referrer condition. (NotNull)
     */
    public void loadRelationshipByFollowIdList(List<User> userList, ConditionBeanSetupper<RelationshipCB> conditionBeanSetupper) {
        xassLRArg(userList, conditionBeanSetupper);
        loadRelationshipByFollowIdList(userList, new LoadReferrerOption<RelationshipCB, Relationship>().xinit(conditionBeanSetupper));
    }
    /**
     * {Refer to overload method that has an argument of the list of entity.}
     * @param user The entity of user. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     */
    public void loadRelationshipByFollowIdList(User user, LoadReferrerOption<RelationshipCB, Relationship> loadReferrerOption) {
        xassLRArg(user, loadReferrerOption);
        loadRelationshipByFollowIdList(xnewLRLs(user), loadReferrerOption);
    }
    /**
     * {Refer to overload method that has an argument of condition-bean setupper.}
     * @param userList The entity list of user. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     */
    public void loadRelationshipByFollowIdList(List<User> userList, LoadReferrerOption<RelationshipCB, Relationship> loadReferrerOption) {
        xassLRArg(userList, loadReferrerOption);
        if (userList.isEmpty()) { return; }
        final RelationshipBhv referrerBhv = xgetBSFLR().select(RelationshipBhv.class);
        helpLoadReferrerInternally(userList, loadReferrerOption, new InternalLoadReferrerCallback<User, Integer, RelationshipCB, Relationship>() {
            public Integer getPKVal(User e)
            { return e.getId(); }
            public void setRfLs(User e, List<Relationship> ls)
            { e.setRelationshipByFollowIdList(ls); }
            public RelationshipCB newMyCB() { return referrerBhv.newMyConditionBean(); }
            public void qyFKIn(RelationshipCB cb, List<Integer> ls)
            { cb.query().setFollowId_InScope(ls); }
            public void qyOdFKAsc(RelationshipCB cb) { cb.query().addOrderBy_FollowId_Asc(); }
            public void spFKCol(RelationshipCB cb) { cb.specify().columnFollowId(); }
            public List<Relationship> selRfLs(RelationshipCB cb) { return referrerBhv.selectList(cb); }
            public Integer getFKVal(Relationship e) { return e.getFollowId(); }
            public void setlcEt(Relationship re, User le)
            { re.setUserByFollowId(le); }
            public String getRfPrNm() { return "relationshipByFollowIdList"; }
        });
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.}
     * @param user The entity of user. (NotNull)
     * @param conditionBeanSetupper The instance of referrer condition-bean set-upper for registering referrer condition. (NotNull)
     */
    public void loadRelationshipByFollowedIdList(User user, ConditionBeanSetupper<RelationshipCB> conditionBeanSetupper) {
        xassLRArg(user, conditionBeanSetupper);
        loadRelationshipByFollowedIdList(xnewLRLs(user), conditionBeanSetupper);
    }
    /**
     * Load referrer of relationshipByFollowedIdList with the set-upper for condition-bean of referrer. <br />
     * relationship by followed_id, named 'relationshipByFollowedIdList'.
     * <pre>
     * userBhv.<span style="color: #FD4747">loadRelationshipByFollowedIdList</span>(userList, new ConditionBeanSetupper&lt;RelationshipCB&gt;() {
     *     public void setup(RelationshipCB cb) {
     *         cb.setupSelect...();
     *         cb.query().setFoo...(value);
     *         cb.query().addOrderBy_Bar...(); <span style="color: #3F7E5E">// basically you should order referrer list</span>
     *     }
     * });
     * for (User user : userList) {
     *     ... = user.<span style="color: #FD4747">getRelationshipByFollowedIdList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key(and others too) is treated as case-insensitive. <br />
     * The condition-bean that the set-upper provides have settings before you touch it. It is as follows:
     * <pre>
     * cb.query().setFollowedId_InScope(pkList);
     * cb.query().addOrderBy_FollowedId_Asc();
     * </pre>
     * @param userList The entity list of user. (NotNull)
     * @param conditionBeanSetupper The instance of referrer condition-bean set-upper for registering referrer condition. (NotNull)
     */
    public void loadRelationshipByFollowedIdList(List<User> userList, ConditionBeanSetupper<RelationshipCB> conditionBeanSetupper) {
        xassLRArg(userList, conditionBeanSetupper);
        loadRelationshipByFollowedIdList(userList, new LoadReferrerOption<RelationshipCB, Relationship>().xinit(conditionBeanSetupper));
    }
    /**
     * {Refer to overload method that has an argument of the list of entity.}
     * @param user The entity of user. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     */
    public void loadRelationshipByFollowedIdList(User user, LoadReferrerOption<RelationshipCB, Relationship> loadReferrerOption) {
        xassLRArg(user, loadReferrerOption);
        loadRelationshipByFollowedIdList(xnewLRLs(user), loadReferrerOption);
    }
    /**
     * {Refer to overload method that has an argument of condition-bean setupper.}
     * @param userList The entity list of user. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     */
    public void loadRelationshipByFollowedIdList(List<User> userList, LoadReferrerOption<RelationshipCB, Relationship> loadReferrerOption) {
        xassLRArg(userList, loadReferrerOption);
        if (userList.isEmpty()) { return; }
        final RelationshipBhv referrerBhv = xgetBSFLR().select(RelationshipBhv.class);
        helpLoadReferrerInternally(userList, loadReferrerOption, new InternalLoadReferrerCallback<User, Integer, RelationshipCB, Relationship>() {
            public Integer getPKVal(User e)
            { return e.getId(); }
            public void setRfLs(User e, List<Relationship> ls)
            { e.setRelationshipByFollowedIdList(ls); }
            public RelationshipCB newMyCB() { return referrerBhv.newMyConditionBean(); }
            public void qyFKIn(RelationshipCB cb, List<Integer> ls)
            { cb.query().setFollowedId_InScope(ls); }
            public void qyOdFKAsc(RelationshipCB cb) { cb.query().addOrderBy_FollowedId_Asc(); }
            public void spFKCol(RelationshipCB cb) { cb.specify().columnFollowedId(); }
            public List<Relationship> selRfLs(RelationshipCB cb) { return referrerBhv.selectList(cb); }
            public Integer getFKVal(Relationship e) { return e.getFollowedId(); }
            public void setlcEt(Relationship re, User le)
            { re.setUserByFollowedId(le); }
            public String getRfPrNm() { return "relationshipByFollowedIdList"; }
        });
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.}
     * @param user The entity of user. (NotNull)
     * @param conditionBeanSetupper The instance of referrer condition-bean set-upper for registering referrer condition. (NotNull)
     */
    public void loadTweetList(User user, ConditionBeanSetupper<TweetCB> conditionBeanSetupper) {
        xassLRArg(user, conditionBeanSetupper);
        loadTweetList(xnewLRLs(user), conditionBeanSetupper);
    }
    /**
     * Load referrer of tweetList with the set-upper for condition-bean of referrer. <br />
     * tweet by user_id, named 'tweetList'.
     * <pre>
     * userBhv.<span style="color: #FD4747">loadTweetList</span>(userList, new ConditionBeanSetupper&lt;TweetCB&gt;() {
     *     public void setup(TweetCB cb) {
     *         cb.setupSelect...();
     *         cb.query().setFoo...(value);
     *         cb.query().addOrderBy_Bar...(); <span style="color: #3F7E5E">// basically you should order referrer list</span>
     *     }
     * });
     * for (User user : userList) {
     *     ... = user.<span style="color: #FD4747">getTweetList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key(and others too) is treated as case-insensitive. <br />
     * The condition-bean that the set-upper provides have settings before you touch it. It is as follows:
     * <pre>
     * cb.query().setUserId_InScope(pkList);
     * cb.query().addOrderBy_UserId_Asc();
     * </pre>
     * @param userList The entity list of user. (NotNull)
     * @param conditionBeanSetupper The instance of referrer condition-bean set-upper for registering referrer condition. (NotNull)
     */
    public void loadTweetList(List<User> userList, ConditionBeanSetupper<TweetCB> conditionBeanSetupper) {
        xassLRArg(userList, conditionBeanSetupper);
        loadTweetList(userList, new LoadReferrerOption<TweetCB, Tweet>().xinit(conditionBeanSetupper));
    }
    /**
     * {Refer to overload method that has an argument of the list of entity.}
     * @param user The entity of user. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     */
    public void loadTweetList(User user, LoadReferrerOption<TweetCB, Tweet> loadReferrerOption) {
        xassLRArg(user, loadReferrerOption);
        loadTweetList(xnewLRLs(user), loadReferrerOption);
    }
    /**
     * {Refer to overload method that has an argument of condition-bean setupper.}
     * @param userList The entity list of user. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     */
    public void loadTweetList(List<User> userList, LoadReferrerOption<TweetCB, Tweet> loadReferrerOption) {
        xassLRArg(userList, loadReferrerOption);
        if (userList.isEmpty()) { return; }
        final TweetBhv referrerBhv = xgetBSFLR().select(TweetBhv.class);
        helpLoadReferrerInternally(userList, loadReferrerOption, new InternalLoadReferrerCallback<User, Integer, TweetCB, Tweet>() {
            public Integer getPKVal(User e)
            { return e.getId(); }
            public void setRfLs(User e, List<Tweet> ls)
            { e.setTweetList(ls); }
            public TweetCB newMyCB() { return referrerBhv.newMyConditionBean(); }
            public void qyFKIn(TweetCB cb, List<Integer> ls)
            { cb.query().setUserId_InScope(ls); }
            public void qyOdFKAsc(TweetCB cb) { cb.query().addOrderBy_UserId_Asc(); }
            public void spFKCol(TweetCB cb) { cb.specify().columnUserId(); }
            public List<Tweet> selRfLs(TweetCB cb) { return referrerBhv.selectList(cb); }
            public Integer getFKVal(Tweet e) { return e.getUserId(); }
            public void setlcEt(Tweet re, User le)
            { re.setUser(le); }
            public String getRfPrNm() { return "tweetList"; }
        });
    }

    // ===================================================================================
    //                                                                   Pull out Relation
    //                                                                   =================

    // ===================================================================================
    //                                                                      Extract Column
    //                                                                      ==============
    /**
     * Extract the value list of (single) primary key id.
     * @param userList The list of user. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<Integer> extractIdList(List<User> userList) {
        return helpExtractListInternally(userList, new InternalExtractCallback<User, Integer>() {
            public Integer getCV(User e) { return e.getId(); }
        });
    }

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity modified-only. (DefaultConstraintsEnabled)
     * <pre>
     * User user = new User();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * user.setFoo...(value);
     * user.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//user.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//user.set...;</span>
     * userBhv.<span style="color: #FD4747">insert</span>(user);
     * ... = user.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param user The entity of insert target. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insert(User user) {
        doInsert(user, null);
    }

    protected void doInsert(User user, InsertOption<UserCB> option) {
        assertObjectNotNull("user", user);
        prepareInsertOption(option);
        delegateInsert(user, option);
    }

    protected void prepareInsertOption(InsertOption<UserCB> option) {
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
     * User user = new User();
     * user.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * user.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//user.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//user.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * user.<span style="color: #FD4747">setVersionNo</span>(value);
     * try {
     *     userBhv.<span style="color: #FD4747">update</span>(user);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * } 
     * </pre>
     * @param user The entity of update target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void update(final User user) {
        doUpdate(user, null);
    }

    protected void doUpdate(User user, final UpdateOption<UserCB> option) {
        assertObjectNotNull("user", user);
        prepareUpdateOption(option);
        helpUpdateInternally(user, new InternalUpdateCallback<User>() {
            public int callbackDelegateUpdate(User entity) { return delegateUpdate(entity, option); } });
    }

    protected void prepareUpdateOption(UpdateOption<UserCB> option) {
        if (option == null) { return; }
        assertUpdateOptionStatus(option);
        if (option.hasSelfSpecification()) {
            option.resolveSelfSpecification(createCBForVaryingUpdate());
        }
        if (option.hasSpecifiedUpdateColumn()) {
            option.resolveUpdateColumnSpecification(createCBForSpecifiedUpdate());
        }
    }

    protected UserCB createCBForVaryingUpdate() {
        UserCB cb = newMyConditionBean();
        cb.xsetupForVaryingUpdate();
        return cb;
    }

    protected UserCB createCBForSpecifiedUpdate() {
        UserCB cb = newMyConditionBean();
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
     * @param user The entity of insert or update target. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdate(User user) {
        doInesrtOrUpdate(user, null, null);
    }

    protected void doInesrtOrUpdate(User user, final InsertOption<UserCB> insertOption, final UpdateOption<UserCB> updateOption) {
        helpInsertOrUpdateInternally(user, new InternalInsertOrUpdateCallback<User, UserCB>() {
            public void callbackInsert(User entity) { doInsert(entity, insertOption); }
            public void callbackUpdate(User entity) { doUpdate(entity, updateOption); }
            public UserCB callbackNewMyConditionBean() { return newMyConditionBean(); }
            public int callbackSelectCount(UserCB cb) { return selectCount(cb); }
        });
    }

    @Override
    protected void doCreateOrModify(Entity entity, InsertOption<? extends ConditionBean> insertOption,
            UpdateOption<? extends ConditionBean> updateOption) {
        if (insertOption == null && updateOption == null) { insertOrUpdate(downcast(entity)); }
        else {
            insertOption = insertOption == null ? new InsertOption<UserCB>() : insertOption;
            updateOption = updateOption == null ? new UpdateOption<UserCB>() : updateOption;
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
     * User user = new User();
     * user.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * user.<span style="color: #FD4747">setVersionNo</span>(value);
     * try {
     *     userBhv.<span style="color: #FD4747">delete</span>(user);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * } 
     * </pre>
     * @param user The entity of delete target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(User user) {
        doDelete(user, null);
    }

    protected void doDelete(User user, final DeleteOption<UserCB> option) {
        assertObjectNotNull("user", user);
        prepareDeleteOption(option);
        helpDeleteInternally(user, new InternalDeleteCallback<User>() {
            public int callbackDelegateDelete(User entity) { return delegateDelete(entity, option); } });
    }

    protected void prepareDeleteOption(DeleteOption<UserCB> option) {
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
     *     User user = new User();
     *     user.setFooName("foo");
     *     if (...) {
     *         user.setFooPrice(123);
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are registered</span>
     *     <span style="color: #3F7E5E">// FOO_PRICE not-called in any entities are registered as null without default value</span>
     *     <span style="color: #3F7E5E">// columns not-called in all entities are registered as null or default value</span>
     *     userList.add(user);
     * }
     * userBhv.<span style="color: #FD4747">batchInsert</span>(userList);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param userList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    public int[] batchInsert(List<User> userList) {
        InsertOption<UserCB> option = createInsertUpdateOption();
        return doBatchInsert(userList, option);
    }

    protected int[] doBatchInsert(List<User> userList, InsertOption<UserCB> option) {
        assertObjectNotNull("userList", userList);
        prepareBatchInsertOption(userList, option);
        return delegateBatchInsert(userList, option);
    }

    protected void prepareBatchInsertOption(List<User> userList, InsertOption<UserCB> option) {
        option.xallowInsertColumnModifiedPropertiesFragmented();
        option.xacceptInsertColumnModifiedPropertiesIfNeeds(userList);
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
     *     User user = new User();
     *     user.setFooName("foo");
     *     if (...) {
     *         user.setFooPrice(123);
     *     } else {
     *         user.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//user.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     userList.add(user);
     * }
     * userBhv.<span style="color: #FD4747">batchUpdate</span>(userList);
     * </pre>
     * @param userList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(List<User> userList) {
        UpdateOption<UserCB> option = createPlainUpdateOption();
        return doBatchUpdate(userList, option);
    }

    protected int[] doBatchUpdate(List<User> userList, UpdateOption<UserCB> option) {
        assertObjectNotNull("userList", userList);
        prepareBatchUpdateOption(userList, option);
        return delegateBatchUpdate(userList, option);
    }

    protected void prepareBatchUpdateOption(List<User> userList, UpdateOption<UserCB> option) {
        option.xacceptUpdateColumnModifiedPropertiesIfNeeds(userList);
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
     * userBhv.<span style="color: #FD4747">batchUpdate</span>(userList, new SpecifyQuery<UserCB>() {
     *     public void specify(UserCB cb) { <span style="color: #3F7E5E">// the two only updated</span>
     *         cb.specify().<span style="color: #FD4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *         cb.specify().<span style="color: #FD4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     }
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span> 
     * userBhv.<span style="color: #FD4747">batchUpdate</span>(userList, new SpecifyQuery<UserCB>() {
     *     public void specify(UserCB cb) { <span style="color: #3F7E5E">// all columns are updated</span>
     *         cb.specify().<span style="color: #FD4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     *     }
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).
     * But if you specify every column, it has no check.</p>
     * @param userList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param updateColumnSpec The specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(List<User> userList, SpecifyQuery<UserCB> updateColumnSpec) {
        return doBatchUpdate(userList, createSpecifiedUpdateOption(updateColumnSpec));
    }

    @Override
    protected int[] doLumpModifyNonstrict(List<Entity> ls, UpdateOption<? extends ConditionBean> option) {
        return doLumpModify(ls, option);
    }

    /**
     * Batch-delete the entity list. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param userList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchDelete(List<User> userList) {
        return doBatchDelete(userList, null);
    }

    protected int[] doBatchDelete(List<User> userList, DeleteOption<UserCB> option) {
        assertObjectNotNull("userList", userList);
        prepareDeleteOption(option);
        return delegateBatchDelete(userList, option);
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
     * userBhv.<span style="color: #FD4747">queryInsert</span>(new QueryInsertSetupper&lt;User, UserCB&gt;() {
     *     public ConditionBean setup(user entity, UserCB intoCB) {
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
    public int queryInsert(QueryInsertSetupper<User, UserCB> setupper) {
        return doQueryInsert(setupper, null);
    }

    protected int doQueryInsert(QueryInsertSetupper<User, UserCB> setupper, InsertOption<UserCB> option) {
        assertObjectNotNull("setupper", setupper);
        prepareInsertOption(option);
        User entity = new User();
        UserCB intoCB = createCBForQueryInsert();
        ConditionBean resourceCB = setupper.setup(entity, intoCB);
        return delegateQueryInsert(entity, intoCB, resourceCB, option);
    }

    protected UserCB createCBForQueryInsert() {
        UserCB cb = newMyConditionBean();
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
     * User user = new User();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//user.setPK...(value);</span>
     * user.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//user.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//user.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//user.setVersionNo(value);</span>
     * UserCB cb = new UserCB();
     * cb.query().setFoo...(value);
     * userBhv.<span style="color: #FD4747">queryUpdate</span>(user, cb);
     * </pre>
     * @param user The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cb The condition-bean of User. (NotNull)
     * @return The updated count.
     * @exception org.seasar.dbflute.exception.NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(User user, UserCB cb) {
        return doQueryUpdate(user, cb, null);
    }

    protected int doQueryUpdate(User user, UserCB cb, UpdateOption<UserCB> option) {
        assertObjectNotNull("user", user); assertCBStateValid(cb);
        prepareUpdateOption(option);
        return checkCountBeforeQueryUpdateIfNeeds(cb) ? delegateQueryUpdate(user, cb, option) : 0;
    }

    @Override
    protected int doRangeModify(Entity entity, ConditionBean cb, UpdateOption<? extends ConditionBean> option) {
        if (option == null) { return queryUpdate(downcast(entity), (UserCB)cb); }
        else { return varyingQueryUpdate(downcast(entity), (UserCB)cb, downcast(option)); }
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * UserCB cb = new UserCB();
     * cb.query().setFoo...(value);
     * userBhv.<span style="color: #FD4747">queryDelete</span>(user, cb);
     * </pre>
     * @param cb The condition-bean of User. (NotNull)
     * @return The deleted count.
     * @exception org.seasar.dbflute.exception.NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(UserCB cb) {
        return doQueryDelete(cb, null);
    }

    protected int doQueryDelete(UserCB cb, DeleteOption<UserCB> option) {
        assertCBStateValid(cb);
        prepareDeleteOption(option);
        return checkCountBeforeQueryUpdateIfNeeds(cb) ? delegateQueryDelete(cb, option) : 0;
    }

    @Override
    protected int doRangeRemove(ConditionBean cb, DeleteOption<? extends ConditionBean> option) {
        if (option == null) { return queryDelete((UserCB)cb); }
        else { return varyingQueryDelete((UserCB)cb, downcast(option)); }
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
     * User user = new User();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * user.setFoo...(value);
     * user.setBar...(value);
     * InsertOption<UserCB> option = new InsertOption<UserCB>();
     * <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     * option.disableCommonColumnAutoSetup();
     * userBhv.<span style="color: #FD4747">varyingInsert</span>(user, option);
     * ... = user.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param user The entity of insert target. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param option The option of insert for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsert(User user, InsertOption<UserCB> option) {
        assertInsertOptionNotNull(option);
        doInsert(user, option);
    }

    /**
     * Update the entity with varying requests modified-only. (ZeroUpdateException, NonExclusiveControl) <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br />
     * Other specifications are same as update(entity).
     * <pre>
     * User user = new User();
     * user.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * user.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * user.<span style="color: #FD4747">setVersionNo</span>(value);
     * try {
     *     <span style="color: #3F7E5E">// you can update by self calculation values</span>
     *     UpdateOption&lt;UserCB&gt; option = new UpdateOption&lt;UserCB&gt;();
     *     option.self(new SpecifyQuery&lt;UserCB&gt;() {
     *         public void specify(UserCB cb) {
     *             cb.specify().<span style="color: #FD4747">columnXxxCount()</span>;
     *         }
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     *     userBhv.<span style="color: #FD4747">varyingUpdate</span>(user, option);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param user The entity of update target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @param option The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdate(User user, UpdateOption<UserCB> option) {
        assertUpdateOptionNotNull(option);
        doUpdate(user, option);
    }

    /**
     * Insert or update the entity with varying requests. (ExclusiveControl: when update) <br />
     * Other specifications are same as insertOrUpdate(entity).
     * @param user The entity of insert or update target. (NotNull)
     * @param insertOption The option of insert for varying requests. (NotNull)
     * @param updateOption The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdate(User user, InsertOption<UserCB> insertOption, UpdateOption<UserCB> updateOption) {
        assertInsertOptionNotNull(insertOption); assertUpdateOptionNotNull(updateOption);
        doInesrtOrUpdate(user, insertOption, updateOption);
    }

    /**
     * Delete the entity with varying requests. (ZeroUpdateException, NonExclusiveControl) <br />
     * Now a valid option does not exist. <br />
     * Other specifications are same as delete(entity).
     * @param user The entity of delete target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @param option The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(User user, DeleteOption<UserCB> option) {
        assertDeleteOptionNotNull(option);
        doDelete(user, option);
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br />
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br />
     * Other specifications are same as batchInsert(entityList).
     * @param userList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of insert for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchInsert(List<User> userList, InsertOption<UserCB> option) {
        assertInsertOptionNotNull(option);
        return doBatchInsert(userList, option);
    }

    /**
     * Batch-update the list with varying requests. <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br />
     * Other specifications are same as batchUpdate(entityList).
     * @param userList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdate(List<User> userList, UpdateOption<UserCB> option) {
        assertUpdateOptionNotNull(option);
        return doBatchUpdate(userList, option);
    }

    /**
     * Batch-delete the list with varying requests. <br />
     * For example, limitBatchDeleteLogging(). <br />
     * Other specifications are same as batchDelete(entityList).
     * @param userList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDelete(List<User> userList, DeleteOption<UserCB> option) {
        assertDeleteOptionNotNull(option);
        return doBatchDelete(userList, option);
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
    public int varyingQueryInsert(QueryInsertSetupper<User, UserCB> setupper, InsertOption<UserCB> option) {
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
     * User user = new User();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//user.setPK...(value);</span>
     * user.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//user.setVersionNo(value);</span>
     * UserCB cb = new UserCB();
     * cb.query().setFoo...(value);
     * UpdateOption&lt;UserCB&gt; option = new UpdateOption&lt;UserCB&gt;();
     * option.self(new SpecifyQuery&lt;UserCB&gt;() {
     *     public void specify(UserCB cb) {
     *         cb.specify().<span style="color: #FD4747">columnFooCount()</span>;
     *     }
     * }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * userBhv.<span style="color: #FD4747">varyingQueryUpdate</span>(user, cb, option);
     * </pre>
     * @param user The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cb The condition-bean of User. (NotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The updated count.
     * @exception org.seasar.dbflute.exception.NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(User user, UserCB cb, UpdateOption<UserCB> option) {
        assertUpdateOptionNotNull(option);
        return doQueryUpdate(user, cb, option);
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br />
     * For example, allowNonQueryDelete(). <br />
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param cb The condition-bean of User. (NotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @exception org.seasar.dbflute.exception.NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(UserCB cb, DeleteOption<UserCB> option) {
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
    public OutsideSqlBasicExecutor<UserBhv> outsideSql() {
        return doOutsideSql();
    }

    // ===================================================================================
    //                                                                     Delegate Method
    //                                                                     ===============
    // [Behavior Command]
    // -----------------------------------------------------
    //                                                Select
    //                                                ------
    protected int delegateSelectCountUniquely(UserCB cb) { return invoke(createSelectCountCBCommand(cb, true)); }
    protected int delegateSelectCountPlainly(UserCB cb) { return invoke(createSelectCountCBCommand(cb, false)); }
    protected <ENTITY extends User> void delegateSelectCursor(UserCB cb, EntityRowHandler<ENTITY> erh, Class<ENTITY> et)
    { invoke(createSelectCursorCBCommand(cb, erh, et)); }
    protected <ENTITY extends User> List<ENTITY> delegateSelectList(UserCB cb, Class<ENTITY> et)
    { return invoke(createSelectListCBCommand(cb, et)); }

    // -----------------------------------------------------
    //                                                Update
    //                                                ------
    protected int delegateInsert(User e, InsertOption<UserCB> op)
    { if (!processBeforeInsert(e, op)) { return 0; }
      return invoke(createInsertEntityCommand(e, op)); }
    protected int delegateUpdate(User e, UpdateOption<UserCB> op)
    { if (!processBeforeUpdate(e, op)) { return 0; }
      return delegateUpdateNonstrict(e, op); }
    protected int delegateUpdateNonstrict(User e, UpdateOption<UserCB> op)
    { if (!processBeforeUpdate(e, op)) { return 0; }
      return invoke(createUpdateNonstrictEntityCommand(e, op)); }
    protected int delegateDelete(User e, DeleteOption<UserCB> op)
    { if (!processBeforeDelete(e, op)) { return 0; }
      return delegateDeleteNonstrict(e, op); }
    protected int delegateDeleteNonstrict(User e, DeleteOption<UserCB> op)
    { if (!processBeforeDelete(e, op)) { return 0; }
      return invoke(createDeleteNonstrictEntityCommand(e, op)); }

    protected int[] delegateBatchInsert(List<User> ls, InsertOption<UserCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchInsertCommand(processBatchInternally(ls, op), op)); }
    protected int[] delegateBatchUpdate(List<User> ls, UpdateOption<UserCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return delegateBatchUpdateNonstrict(ls, op); }
    protected int[] delegateBatchUpdateNonstrict(List<User> ls, UpdateOption<UserCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchUpdateNonstrictCommand(processBatchInternally(ls, op, true), op)); }
    protected int[] delegateBatchDelete(List<User> ls, DeleteOption<UserCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return delegateBatchDeleteNonstrict(ls, op); }
    protected int[] delegateBatchDeleteNonstrict(List<User> ls, DeleteOption<UserCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchDeleteNonstrictCommand(processBatchInternally(ls, op, true), op)); }

    protected int delegateQueryInsert(User e, UserCB inCB, ConditionBean resCB, InsertOption<UserCB> op)
    { if (!processBeforeQueryInsert(e, inCB, resCB, op)) { return 0; } return invoke(createQueryInsertCBCommand(e, inCB, resCB, op));  }
    protected int delegateQueryUpdate(User e, UserCB cb, UpdateOption<UserCB> op)
    { if (!processBeforeQueryUpdate(e, cb, op)) { return 0; } return invoke(createQueryUpdateCBCommand(e, cb, op));  }
    protected int delegateQueryDelete(UserCB cb, DeleteOption<UserCB> op)
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
    protected User downcast(Entity entity) {
        return helpEntityDowncastInternally(entity, User.class);
    }

    protected UserCB downcast(ConditionBean cb) {
        return helpConditionBeanDowncastInternally(cb, UserCB.class);
    }

    @SuppressWarnings("unchecked")
    protected List<User> downcast(List<? extends Entity> entityList) {
        return (List<User>)entityList;
    }

    @SuppressWarnings("unchecked")
    protected InsertOption<UserCB> downcast(InsertOption<? extends ConditionBean> option) {
        return (InsertOption<UserCB>)option;
    }

    @SuppressWarnings("unchecked")
    protected UpdateOption<UserCB> downcast(UpdateOption<? extends ConditionBean> option) {
        return (UpdateOption<UserCB>)option;
    }

    @SuppressWarnings("unchecked")
    protected DeleteOption<UserCB> downcast(DeleteOption<? extends ConditionBean> option) {
        return (DeleteOption<UserCB>)option;
    }

    @SuppressWarnings("unchecked")
    protected QueryInsertSetupper<User, UserCB> downcast(QueryInsertSetupper<? extends Entity, ? extends ConditionBean> option) {
        return (QueryInsertSetupper<User, UserCB>)option;
    }
}
