package com.sample.twitter.dbflute.bsentity.dbmeta;

import java.util.List;
import java.util.Map;

import org.seasar.dbflute.DBDef;
import org.seasar.dbflute.Entity;
import org.seasar.dbflute.dbmeta.AbstractDBMeta;
import org.seasar.dbflute.dbmeta.PropertyGateway;
import org.seasar.dbflute.dbmeta.info.*;
import org.seasar.dbflute.dbmeta.name.*;
import com.sample.twitter.dbflute.allcommon.*;
import com.sample.twitter.dbflute.exentity.*;

/**
 * The DB meta of user. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class UserDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final UserDbm _instance = new UserDbm();
    private UserDbm() {}
    public static UserDbm getInstance() { return _instance; }

    // ===================================================================================
    //                                                                       Current DBDef
    //                                                                       =============
    public DBDef getCurrentDBDef() { return DBCurrent.getInstance().currentDBDef(); }

    // ===================================================================================
    //                                                                    Property Gateway
    //                                                                    ================
    protected final Map<String, PropertyGateway> _epgMap = newHashMap();
    {
        setupEpg(_epgMap, new EpgId(), "id");
        setupEpg(_epgMap, new EpgUsername(), "username");
        setupEpg(_epgMap, new EpgPassword(), "password");
        setupEpg(_epgMap, new EpgEmail(), "email");
        setupEpg(_epgMap, new EpgCreateAt(), "createAt");
    }
    public PropertyGateway findPropertyGateway(String propertyName)
    { return doFindEpg(_epgMap, propertyName); }
    public static class EpgId implements PropertyGateway {
        public Object read(Entity e) { return ((User)e).getId(); }
        public void write(Entity e, Object v) { ((User)e).setId(cti(v)); }
    }
    public static class EpgUsername implements PropertyGateway {
        public Object read(Entity e) { return ((User)e).getUsername(); }
        public void write(Entity e, Object v) { ((User)e).setUsername((String)v); }
    }
    public static class EpgPassword implements PropertyGateway {
        public Object read(Entity e) { return ((User)e).getPassword(); }
        public void write(Entity e, Object v) { ((User)e).setPassword((String)v); }
    }
    public static class EpgEmail implements PropertyGateway {
        public Object read(Entity e) { return ((User)e).getEmail(); }
        public void write(Entity e, Object v) { ((User)e).setEmail((String)v); }
    }
    public static class EpgCreateAt implements PropertyGateway {
        public Object read(Entity e) { return ((User)e).getCreateAt(); }
        public void write(Entity e, Object v) { ((User)e).setCreateAt((java.sql.Timestamp)v); }
    }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "user";
    protected final String _tablePropertyName = "user";
    protected final TableSqlName _tableSqlName = new TableSqlName("user", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnId = cci("id", "id", null, null, true, "id", Integer.class, true, true, "INT UNSIGNED", 10, 0, null, false, null, null, null, "relationshipByFollowIdList,relationshipByFollowedIdList,tweetList", null);
    protected final ColumnInfo _columnUsername = cci("username", "username", null, null, true, "username", String.class, false, false, "CHAR", 50, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnPassword = cci("password", "password", null, null, true, "password", String.class, false, false, "CHAR", 255, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnEmail = cci("email", "email", null, null, true, "email", String.class, false, false, "CHAR", 100, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnCreateAt = cci("create_at", "create_at", null, null, true, "createAt", java.sql.Timestamp.class, false, false, "TIMESTAMP", 19, 0, "CURRENT_TIMESTAMP", false, null, null, null, null, null);

    public ColumnInfo columnId() { return _columnId; }
    public ColumnInfo columnUsername() { return _columnUsername; }
    public ColumnInfo columnPassword() { return _columnPassword; }
    public ColumnInfo columnEmail() { return _columnEmail; }
    public ColumnInfo columnCreateAt() { return _columnCreateAt; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnId());
        ls.add(columnUsername());
        ls.add(columnPassword());
        ls.add(columnEmail());
        ls.add(columnCreateAt());
        return ls;
    }

    { initializeInformationResource(); }

    // ===================================================================================
    //                                                                         Unique Info
    //                                                                         ===========
    // -----------------------------------------------------
    //                                       Primary Element
    //                                       ---------------
    protected UniqueInfo cpui() { return hpcpui(columnId()); }
    public boolean hasPrimaryKey() { return true; }
    public boolean hasCompoundPrimaryKey() { return false; }

    // ===================================================================================
    //                                                                       Relation Info
    //                                                                       =============
    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------
    public ReferrerInfo referrerRelationshipByFollowIdList() {
        Map<ColumnInfo, ColumnInfo> map = newLinkedHashMap(columnId(), RelationshipDbm.getInstance().columnFollowId());
        return cri("relationship_ibfk_1", "relationshipByFollowIdList", this, RelationshipDbm.getInstance(), map, false, "userByFollowId");
    }
    public ReferrerInfo referrerRelationshipByFollowedIdList() {
        Map<ColumnInfo, ColumnInfo> map = newLinkedHashMap(columnId(), RelationshipDbm.getInstance().columnFollowedId());
        return cri("relationship_ibfk_2", "relationshipByFollowedIdList", this, RelationshipDbm.getInstance(), map, false, "userByFollowedId");
    }
    public ReferrerInfo referrerTweetList() {
        Map<ColumnInfo, ColumnInfo> map = newLinkedHashMap(columnId(), TweetDbm.getInstance().columnUserId());
        return cri("tweet_ibfk_1", "tweetList", this, TweetDbm.getInstance(), map, false, "user");
    }

    // ===================================================================================
    //                                                                        Various Info
    //                                                                        ============
    public boolean hasIdentity() { return true; }

    // ===================================================================================
    //                                                                           Type Name
    //                                                                           =========
    public String getEntityTypeName() { return "com.sample.twitter.dbflute.exentity.User"; }
    public String getConditionBeanTypeName() { return "com.sample.twitter.dbflute.cbean.UserCB"; }
    public String getBehaviorTypeName() { return "com.sample.twitter.dbflute.exbhv.UserBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<User> getEntityType() { return User.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public Entity newEntity() { return newMyEntity(); }
    public User newMyEntity() { return new User(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity e, Map<String, ? extends Object> m)
    { doAcceptPrimaryKeyMap((User)e, m); }
    public void acceptAllColumnMap(Entity e, Map<String, ? extends Object> m)
    { doAcceptAllColumnMap((User)e, m); }
    public Map<String, Object> extractPrimaryKeyMap(Entity e) { return doExtractPrimaryKeyMap(e); }
    public Map<String, Object> extractAllColumnMap(Entity e) { return doExtractAllColumnMap(e); }
}
