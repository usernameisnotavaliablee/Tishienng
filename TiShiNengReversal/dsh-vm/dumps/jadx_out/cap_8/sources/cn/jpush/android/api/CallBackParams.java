package cn.jpush.android.api;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class CallBackParams implements java.io.Serializable {
    public int action;
    public java.lang.String alias;
    public java.util.Map<java.lang.String, java.lang.Object> pros;
    public int protoType;
    private long sendTime;
    public int sequence;
    public cn.jpush.android.api.TagAliasCallback tagAliasCallBack;
    public java.util.Set<java.lang.String> tags;

    public CallBackParams(int r1, long r2, int r4, int r5) {
            r0 = this;
            r0.<init>()
            r0.sequence = r1
            r0.sendTime = r2
            r0.protoType = r4
            r0.action = r5
            return
    }

    public CallBackParams(int r1, java.lang.String r2, long r3, int r5, int r6) {
            r0 = this;
            r0.<init>()
            r0.sequence = r1
            r0.alias = r2
            r0.sendTime = r3
            r0.protoType = r5
            r0.action = r6
            return
    }

    public CallBackParams(int r1, java.util.Map<java.lang.String, java.lang.Object> r2, long r3, int r5, int r6) {
            r0 = this;
            r0.<init>()
            r0.sequence = r1
            r0.pros = r2
            r0.sendTime = r3
            r0.protoType = r5
            r0.action = r6
            return
    }

    public CallBackParams(int r1, java.util.Set<java.lang.String> r2, long r3, int r5, int r6) {
            r0 = this;
            r0.<init>()
            r0.sequence = r1
            r0.tags = r2
            r0.sendTime = r3
            r0.protoType = r5
            r0.action = r6
            return
    }

    public CallBackParams(java.lang.String r1, java.util.Set<java.lang.String> r2, cn.jpush.android.api.TagAliasCallback r3, long r4, int r6, int r7) {
            r0 = this;
            r0.<init>()
            r0.alias = r1
            r0.tags = r2
            r0.tagAliasCallBack = r3
            r0.sendTime = r4
            r0.protoType = r6
            r0.action = r7
            long r1 = cn.jpush.android.helper.f.a()
            int r2 = (int) r1
            r0.sequence = r2
            return
    }

    public boolean isTimeOut(long r7) {
            r6 = this;
            int r0 = r6.protoType
            r1 = 0
            if (r0 != 0) goto L15
            long r2 = java.lang.System.currentTimeMillis()
            long r4 = r6.sendTime
            long r2 = r2 - r4
            r4 = 10000(0x2710, double:4.9407E-320)
            long r7 = r7 + r4
            int r0 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r0 <= 0) goto L15
            r7 = 1
            return r7
        L15:
            return r1
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "CallBackParams{sendTime="
            r0.append(r1)
            long r1 = r3.sendTime
            r0.append(r1)
            java.lang.String r1 = ", alias='"
            r0.append(r1)
            java.lang.String r1 = r3.alias
            r0.append(r1)
            r1 = 39
            r0.append(r1)
            java.lang.String r2 = ", pros='"
            r0.append(r2)
            java.util.Map<java.lang.String, java.lang.Object> r2 = r3.pros
            r0.append(r2)
            r0.append(r1)
            java.lang.String r1 = ", tags="
            r0.append(r1)
            java.util.Set<java.lang.String> r1 = r3.tags
            r0.append(r1)
            java.lang.String r1 = ", tagAliasCallBack="
            r0.append(r1)
            cn.jpush.android.api.TagAliasCallback r1 = r3.tagAliasCallBack
            r0.append(r1)
            java.lang.String r1 = ", sequence="
            r0.append(r1)
            int r1 = r3.sequence
            r0.append(r1)
            java.lang.String r1 = ", protoType="
            r0.append(r1)
            int r1 = r3.protoType
            r0.append(r1)
            java.lang.String r1 = ", action="
            r0.append(r1)
            int r1 = r3.action
            r0.append(r1)
            r1 = 125(0x7d, float:1.75E-43)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
