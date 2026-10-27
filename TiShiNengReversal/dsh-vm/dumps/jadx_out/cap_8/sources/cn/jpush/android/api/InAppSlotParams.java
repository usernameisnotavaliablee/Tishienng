package cn.jpush.android.api;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class InAppSlotParams {
    public int a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f1700b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f1701c;

    public static class Builder {
        cn.jpush.android.api.InAppSlotParams a;

        public Builder() {
                r1 = this;
                r1.<init>()
                cn.jpush.android.api.InAppSlotParams r0 = new cn.jpush.android.api.InAppSlotParams
                r0.<init>()
                r1.a = r0
                return
        }

        public cn.jpush.android.api.InAppSlotParams build() {
                r1 = this;
                cn.jpush.android.api.InAppSlotParams r0 = r1.a
                return r0
        }

        public cn.jpush.android.api.InAppSlotParams.Builder setAdEvent(java.lang.String r2) {
                r1 = this;
                cn.jpush.android.api.InAppSlotParams r0 = r1.a
                r0.f1701c = r2
                return r1
        }

        public cn.jpush.android.api.InAppSlotParams.Builder setAdSlot(java.lang.String r2) {
                r1 = this;
                cn.jpush.android.api.InAppSlotParams r0 = r1.a
                r0.f1700b = r2
                return r1
        }

        public cn.jpush.android.api.InAppSlotParams.Builder setSequence(int r2) {
                r1 = this;
                cn.jpush.android.api.InAppSlotParams r0 = r1.a
                r0.a = r2
                return r1
        }
    }

    public interface SLOT_KEY {
        public static final java.lang.String EVENT = "event";
        public static final java.lang.String SEQ = "sequence";
        public static final java.lang.String SLOT = "slot";
    }

    public InAppSlotParams() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.a = r0
            java.lang.String r0 = ""
            r1.f1700b = r0
            r1.f1701c = r0
            return
    }

    public static cn.jpush.android.api.InAppSlotParams.Builder builder() {
            cn.jpush.android.api.InAppSlotParams$Builder r0 = new cn.jpush.android.api.InAppSlotParams$Builder
            r0.<init>()
            return r0
    }

    public static cn.jpush.android.api.InAppSlotParams parseJSONString(java.lang.String r4) {
            java.lang.String r0 = ""
            cn.jpush.android.api.InAppSlotParams r1 = new cn.jpush.android.api.InAppSlotParams
            r1.<init>()
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L25
            r2.<init>(r4)     // Catch: java.lang.Throwable -> L25
            java.lang.String r4 = "sequence"
            r3 = 0
            int r4 = r2.optInt(r4, r3)     // Catch: java.lang.Throwable -> L25
            r1.a = r4     // Catch: java.lang.Throwable -> L25
            java.lang.String r4 = "slot"
            java.lang.String r4 = r2.optString(r4, r0)     // Catch: java.lang.Throwable -> L25
            r1.f1700b = r4     // Catch: java.lang.Throwable -> L25
            java.lang.String r4 = "event"
            java.lang.String r4 = r2.optString(r4, r0)     // Catch: java.lang.Throwable -> L25
            r1.f1701c = r4     // Catch: java.lang.Throwable -> L25
        L25:
            return r1
    }

    public java.lang.String toJSONString() {
            r3 = this;
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            java.lang.String r1 = "sequence"
            int r2 = r3.a     // Catch: org.json.JSONException -> L1a
            r0.put(r1, r2)     // Catch: org.json.JSONException -> L1a
            java.lang.String r1 = "slot"
            java.lang.String r2 = r3.f1700b     // Catch: org.json.JSONException -> L1a
            r0.put(r1, r2)     // Catch: org.json.JSONException -> L1a
            java.lang.String r1 = "event"
            java.lang.String r2 = r3.f1701c     // Catch: org.json.JSONException -> L1a
            r0.put(r1, r2)     // Catch: org.json.JSONException -> L1a
        L1a:
            java.lang.String r0 = r0.toString()
            return r0
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "InAppSlotParams{sequence="
            r0.append(r1)
            int r1 = r3.a
            r0.append(r1)
            java.lang.String r1 = ", adSlot='"
            r0.append(r1)
            java.lang.String r1 = r3.f1700b
            r0.append(r1)
            r1 = 39
            r0.append(r1)
            java.lang.String r2 = ", adEvent='"
            r0.append(r2)
            java.lang.String r2 = r3.f1701c
            r0.append(r2)
            r0.append(r1)
            r1 = 125(0x7d, float:1.75E-43)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
