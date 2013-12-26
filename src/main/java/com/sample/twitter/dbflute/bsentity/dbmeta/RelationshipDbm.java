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
 * The DB meta of relationship. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class RelationshipDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final RelationshipDbm _instance = new RelationshipDbm();
    private RelationshipDbm() {}
    public static RelationshipDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, new EpgFollowId(), "followId");
        setupEpg(_epgMap, new EpgFollowedId(), "followedId");
    }
    public PropertyGateway findPropertyGateway(String propertyName)
    { return doFindEpg(_epgMap, propertyName); }
    public static class EpgId implements PropertyGateway {
        public Object read(Entity e) { return ((Relationship)e).getId(); }
        public void write(Entity e, Object v) { ((Relationship)e).setId(cti(v)); }
    }
    public static class EpgFollowId implements PropertyGateway {
        public Object read(Entity e) { return ((Relationship)e).getFollowId(); }
        public void write(Entity e, Object v) { ((Relationship)e).setFollowId(cti(v)); }
    }
    public static class EpgFollowedId implements PropertyGateway {
        public Object read(Entity e) { return ((Relationship)e).getFollowedId(); }
        public void write(Entity e, Object v) { ((Relationship)e).setFollowedId(cti(v)); }
    }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "relationship";
    protected final String _tablePropertyName = "relationship";
    protected final TableSqlName _tableSqlName = new TableSqlName("relationship", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnId = cci("id", "id", null, null, true, "id", Integer.class, true, true, "INT UNSIGNED", 10, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnFollowId = cci("follow_id", "follow_id", null, null, true, "followId", Integer.class, false, false, "INT UNSIGNED", 10, 0, null, false, null, null, "userByFollowId", null, null);
    protected final ColumnInfo _columnFollowedId = cci("followed_id", "followed_id", null, null, true, "followedId", Integer.class, false, false, "INT UNSIGNED", 10, 0, null, false, null, null, "userByFollowedId", null, null);

    public ColumnInfo columnId() { return _columnId; }
    public ColumnInfo columnFollowId() { return _columnFollowId; }
    public ColumnInfo columnFollowedId() { return _columnFollowedId; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnId());
        ls.add(columnFollowId());
        ls.add(columnFollowedId());
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
    public ForeignInfo foreignUserByFollowId() {
        Map<ColumnInfo, ColumnInfo> map = newLinkedHashMap(columnFollowId(), UserDbm.getInstance().columnId());
        return cfi("relationship_ibfk_1", "userByFollowId", this, UserDbm.getInstance(), map, 0, false, false, false, false, null, null, false, "relationshipByFollowIdList");
    }
    public ForeignInfo foreignUserByFollowedId() {
        Map<ColumnInfo, ColumnInfo> map = newLinkedHashMap(columnFollowedId(), UserDbm.getInstance().columnId());
        return cfi("relationship_ibfk_2", "userByFollowedId", this, UserDbm.getInstance(), map, 1, false, false, false, false, null, null, false, "relationshipByFollowedIdList");
    }

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------

    // ===================================================================================
    //                                                                        Various Info
    //                                                                        ============
    public boolean hasIdentity() { return true; }

    // ===================================================================================
    //                                                                           Type Name
    //                                                                           =========
    public String getEntityTypeName() { return "com.sample.twitter.dbflute.exentity.Relationship"; }
    public String getConditionBeanTypeName() { return "com.sample.twitter.dbflute.cbean.RelationshipCB"; }
    public String getBehaviorTypeName() { return "com.sample.twitter.dbflute.exbhv.RelationshipBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<Relationship> getEntityType() { return Relationship.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public Entity newEntity() { return newMyEntity(); }
    public Relationship newMyEntity() { return new Relationship(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity e, Map<String, ? extends Object> m)
    { doAcceptPrimaryKeyMap((Relationship)e, m); }
    public void acceptAllColumnMap(Entity e, Map<String, ? extends Object> m)
    { doAcceptAllColumnMap((Relationship)e, m); }
    public Map<String, Object> extractPrimaryKeyMap(Entity e) { return doExtractPrimaryKeyMap(e); }
    public Map<String, Object> extractAllColumnMap(Entity e) { return doExtractAllColumnMap(e); }
}
