package cn.jiguang.c;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class c {

    private static class a {
        public a() {
                r1 = this;
                r1.<init>()
                return
        }

        public static void a(android.content.Context r8, java.lang.String r9, android.os.Bundle r10, java.lang.Object... r11) {
                java.lang.String r9 = "JPushScenarios"
                if (r10 != 0) goto La
                java.lang.String r8 = "onEvent: bundle is null"
                cn.jiguang.w.f.i(r9, r8)
                return
            La:
                java.lang.String r11 = "type"
                java.lang.String r11 = r10.getString(r11)
                java.lang.String r0 = "start_service"
                boolean r0 = r0.equals(r11)
                if (r0 == 0) goto L51
                java.lang.String r11 = "jg_time_start_id"
                r0 = 0
                long r4 = r10.getLong(r11, r0)
                java.lang.String r11 = "time_id"
                long r6 = r10.getLong(r11, r0)
                int r10 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
                if (r10 <= 0) goto L34
                int r10 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
                if (r10 <= 0) goto L34
                r3 = 0
                r2 = r8
                cn.jiguang.v.m.a(r2, r3, r4, r6)
                return
            L34:
                java.lang.StringBuilder r8 = new java.lang.StringBuilder
                r8.<init>()
                java.lang.String r10 = "onEvent: invalid time values, jgTimeStartId="
                r8.append(r10)
                r8.append(r4)
                java.lang.String r10 = ", timeId="
                r8.append(r10)
                r8.append(r6)
                java.lang.String r8 = r8.toString()
                cn.jiguang.w.f.i(r9, r8)
                return
            L51:
                java.lang.StringBuilder r8 = new java.lang.StringBuilder
                r8.<init>()
                java.lang.String r10 = "onEvent: unknown type: "
                r8.append(r10)
                r8.append(r11)
                java.lang.String r8 = r8.toString()
                cn.jiguang.w.f.c(r9, r8)
                return
        }
    }

    public c() {
            r1 = this;
            r1.<init>()
            return
    }

    public static void a(android.content.Context r1, java.lang.String r2, java.lang.String r3, android.os.Bundle r4, java.lang.Object... r5) {
            java.lang.String r0 = "jpush_scenarios"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto Lc
            cn.jiguang.c.c.a.a(r1, r2, r4, r5)
            return
        Lc:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "onEvent: unknown action: "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "JSendCoreHelper"
            cn.jiguang.w.f.c(r2, r1)
            return
    }
}
