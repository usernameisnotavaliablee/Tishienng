package com.kwad.components.offline.api.explore;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public interface ExploreOfflineCompoInitConfig extends com.kwad.components.offline.api.IOfflineCompoInitConfig {
    java.lang.Object callMethod(java.lang.Object r1, java.lang.String r2, java.lang.Object... r3);

    java.lang.Object callStaticMethod(java.lang.Class<?> r1, java.lang.String r2, java.lang.Object... r3);

    boolean classExists(java.lang.String r1);

    java.util.List<java.lang.Object> getAllFieldValue(java.lang.Object r1);

    java.lang.String getConfig();

    java.lang.Object getField(java.lang.Object r1, java.lang.String r2);

    java.lang.String getFieldNameByTypeName(java.lang.Class<?> r1, java.lang.String r2);

    com.kwad.components.offline.api.explore.model.ExploreConfig.TTInjectConfig getInjectConfig(java.lang.String r1);

    java.lang.String getSdkVersion();

    java.lang.Object getStaticFieldByTypeName(java.lang.Class<?> r1, java.lang.String r2);

    boolean hasDowngraded(java.lang.String r1);

    boolean isPrimitive(java.lang.Object r1);

    void logOnPublish(java.lang.String r1, java.lang.String r2);

    void onConfigCallback(int r1);

    void onLog(java.lang.String r1, java.lang.String r2);

    void onReport(com.kwad.components.offline.api.explore.model.FuncInfo r1);

    void onTaskReady(java.lang.Runnable r1);

    void saveDowngraded(java.lang.String r1);

    void setStaticField(java.lang.Class<?> r1, java.lang.String r2, java.lang.Object r3);
}
