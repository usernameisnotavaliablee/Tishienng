package x0;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public class b extends android.database.sqlite.SQLiteOpenHelper {
    public b(@androidx.annotation.Nullable android.content.Context r4) {
            r3 = this;
            com.bytedance.sdk.openadsdk.api.plugin.j r0 = new com.bytedance.sdk.openadsdk.api.plugin.j
            r0.<init>(r4)
            r4 = 0
            r1 = 1
            java.lang.String r2 = "npth_log.db"
            r3.<init>(r0, r2, r4, r1)
            return
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(android.database.sqlite.SQLiteDatabase r2) {
            r1 = this;
            com.bytedance.j.xt.xt.xt.b r0 = new com.bytedance.j.xt.xt.xt.b
            r0.<init>()
            r0.c(r2)
            return
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(android.database.sqlite.SQLiteDatabase r1, int r2, int r3) {
            r0 = this;
            return
    }
}
