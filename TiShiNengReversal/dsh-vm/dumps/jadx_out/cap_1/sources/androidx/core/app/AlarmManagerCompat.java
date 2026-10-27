package androidx.core.app;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class AlarmManagerCompat {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @androidx.annotation.RequiresApi(21)
    static class Api21Impl {
        private Api21Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        @androidx.annotation.DoNotInline
        static android.app.AlarmManager.AlarmClockInfo createAlarmClockInfo(long r1, android.app.PendingIntent r3) {
                android.app.AlarmManager$AlarmClockInfo r0 = new android.app.AlarmManager$AlarmClockInfo
                r0.<init>(r1, r3)
                return r0
        }

        @androidx.annotation.DoNotInline
        static void setAlarmClock(android.app.AlarmManager r0, java.lang.Object r1, android.app.PendingIntent r2) {
                android.app.AlarmManager$AlarmClockInfo r1 = (android.app.AlarmManager.AlarmClockInfo) r1
                r0.setAlarmClock(r1, r2)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @androidx.annotation.RequiresApi(23)
    static class Api23Impl {
        private Api23Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        @androidx.annotation.DoNotInline
        static void setAndAllowWhileIdle(android.app.AlarmManager r0, int r1, long r2, android.app.PendingIntent r4) {
                r0.setAndAllowWhileIdle(r1, r2, r4)
                return
        }

        @androidx.annotation.DoNotInline
        static void setExactAndAllowWhileIdle(android.app.AlarmManager r0, int r1, long r2, android.app.PendingIntent r4) {
                r0.setExactAndAllowWhileIdle(r1, r2, r4)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @androidx.annotation.RequiresApi(31)
    static class Api31Impl {
        private Api31Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        @androidx.annotation.DoNotInline
        static boolean canScheduleExactAlarms(android.app.AlarmManager r0) {
                boolean r0 = r0.canScheduleExactAlarms()
                return r0
        }
    }

    private AlarmManagerCompat() {
            r0 = this;
            r0.<init>()
            return
    }

    public static boolean canScheduleExactAlarms(@androidx.annotation.NonNull android.app.AlarmManager r2) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 31
            if (r0 < r1) goto Lb
            boolean r2 = androidx.core.app.AlarmManagerCompat.Api31Impl.canScheduleExactAlarms(r2)
            return r2
        Lb:
            r2 = 1
            return r2
    }

    @android.annotation.SuppressLint({"MissingPermission"})
    public static void setAlarmClock(@androidx.annotation.NonNull android.app.AlarmManager r0, long r1, @androidx.annotation.NonNull android.app.PendingIntent r3, @androidx.annotation.NonNull android.app.PendingIntent r4) {
            android.app.AlarmManager$AlarmClockInfo r1 = androidx.core.app.AlarmManagerCompat.Api21Impl.createAlarmClockInfo(r1, r3)
            androidx.core.app.AlarmManagerCompat.Api21Impl.setAlarmClock(r0, r1, r4)
            return
    }

    public static void setAndAllowWhileIdle(@androidx.annotation.NonNull android.app.AlarmManager r2, int r3, long r4, @androidx.annotation.NonNull android.app.PendingIntent r6) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 23
            if (r0 < r1) goto La
            androidx.core.app.AlarmManagerCompat.Api23Impl.setAndAllowWhileIdle(r2, r3, r4, r6)
            return
        La:
            r2.set(r3, r4, r6)
            return
    }

    public static void setExact(@androidx.annotation.NonNull android.app.AlarmManager r0, int r1, long r2, @androidx.annotation.NonNull android.app.PendingIntent r4) {
            r0.setExact(r1, r2, r4)
            return
    }

    public static void setExactAndAllowWhileIdle(@androidx.annotation.NonNull android.app.AlarmManager r2, int r3, long r4, @androidx.annotation.NonNull android.app.PendingIntent r6) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 23
            if (r0 < r1) goto La
            androidx.core.app.AlarmManagerCompat.Api23Impl.setExactAndAllowWhileIdle(r2, r3, r4, r6)
            return
        La:
            setExact(r2, r3, r4, r6)
            return
    }
}
