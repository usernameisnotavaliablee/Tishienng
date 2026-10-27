package cn.jpush.android.service;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class TagAliasReceiver extends android.content.BroadcastReceiver {
    public static final java.lang.String ACTION_TAG_ALIAS_CALLBACK = "cn.jpush.android.intent.TAG_ALIAS_CALLBACK";
    public static final java.lang.String ACTION_TAG_ALIAS_TIMEOUT = "cn.jpush.android.intent.TAG_ALIAS_TIMEOUT";
    public static final java.lang.String KEY_TAGALIASOPERATOR_CALLBACKCODE = "tagalias_errorcode";
    public static final java.lang.String KEY_TAGALIASOPERATOR_SEQID = "tagalias_seqid";
    private static final java.lang.String TAG = "TagAliasReceiver";

    public TagAliasReceiver() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(android.content.Context r11, android.content.Intent r12) {
            r10 = this;
            java.lang.String r0 = "TagAliasReceiver"
            if (r12 != 0) goto La
            java.lang.String r11 = "TagAliasOperator onReceive intent is null"
            cn.jpush.android.helper.Logger.ww(r0, r11)
            return
        La:
            java.lang.String r1 = "tagalias_seqid"
            r2 = -1
            long r6 = r12.getLongExtra(r1, r2)
            java.lang.String r1 = "tagalias_errorcode"
            r4 = 0
            int r8 = r12.getIntExtra(r1, r4)
            int r1 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r1 != 0) goto L23
            java.lang.String r11 = "TagAliasOperator onReceive rid is invalide"
            cn.jpush.android.helper.Logger.w(r0, r11)
            return
        L23:
            cn.jpush.android.local.ActionHelper r4 = cn.jpush.android.local.ActionHelper.getInstance()
            r5 = r11
            r9 = r12
            r4.onTagAliasResponse(r5, r6, r8, r9)
            return
    }
}
