package com.bytedance.pangle.provider;

@androidx.annotation.Keep
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_7_sz8008092.dex */
public abstract class PluginContentProvider extends android.content.ContentProvider {
    protected android.net.Uri pluginUri;

    public PluginContentProvider() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // android.content.ContentProvider
    public abstract int delete(android.net.Uri r1, java.lang.String r2, java.lang.String[] r3);

    @Override // android.content.ContentProvider
    public abstract java.lang.String getType(android.net.Uri r1);

    @Override // android.content.ContentProvider
    public abstract android.net.Uri insert(android.net.Uri r1, android.content.ContentValues r2);

    @Override // android.content.ContentProvider
    public abstract android.database.Cursor query(android.net.Uri r1, java.lang.String[] r2, java.lang.String r3, java.lang.String[] r4, java.lang.String r5);

    @Override // android.content.ContentProvider
    public abstract int update(android.net.Uri r1, android.content.ContentValues r2, java.lang.String r3, java.lang.String[] r4);
}
