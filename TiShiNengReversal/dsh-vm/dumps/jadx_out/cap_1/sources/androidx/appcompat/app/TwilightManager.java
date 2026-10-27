package androidx.appcompat.app;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
class TwilightManager {
    private static final int SUNRISE = 6;
    private static final int SUNSET = 22;
    private static final java.lang.String TAG = "TwilightManager";
    private static androidx.appcompat.app.TwilightManager sInstance;
    private final android.content.Context mContext;
    private final android.location.LocationManager mLocationManager;
    private final androidx.appcompat.app.TwilightManager.TwilightState mTwilightState;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class TwilightState {
        boolean isNight;
        long nextUpdate;

        TwilightState() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    @androidx.annotation.VisibleForTesting
    TwilightManager(@androidx.annotation.NonNull android.content.Context r2, @androidx.annotation.NonNull android.location.LocationManager r3) {
            r1 = this;
            r1.<init>()
            androidx.appcompat.app.TwilightManager$TwilightState r0 = new androidx.appcompat.app.TwilightManager$TwilightState
            r0.<init>()
            r1.mTwilightState = r0
            r1.mContext = r2
            r1.mLocationManager = r3
            return
    }

    static androidx.appcompat.app.TwilightManager getInstance(@androidx.annotation.NonNull android.content.Context r2) {
            androidx.appcompat.app.TwilightManager r0 = androidx.appcompat.app.TwilightManager.sInstance
            if (r0 != 0) goto L17
            android.content.Context r2 = r2.getApplicationContext()
            androidx.appcompat.app.TwilightManager r0 = new androidx.appcompat.app.TwilightManager
            java.lang.String r1 = "location"
            java.lang.Object r1 = r2.getSystemService(r1)
            android.location.LocationManager r1 = (android.location.LocationManager) r1
            r0.<init>(r2, r1)
            androidx.appcompat.app.TwilightManager.sInstance = r0
        L17:
            androidx.appcompat.app.TwilightManager r2 = androidx.appcompat.app.TwilightManager.sInstance
            return r2
    }

    @android.annotation.SuppressLint({"MissingPermission"})
    private android.location.Location getLastKnownLocation() {
            r7 = this;
            android.content.Context r0 = r7.mContext
            java.lang.String r1 = "android.permission.ACCESS_COARSE_LOCATION"
            int r0 = androidx.core.content.PermissionChecker.checkSelfPermission(r0, r1)
            r1 = 0
            if (r0 != 0) goto L12
            java.lang.String r0 = "network"
            android.location.Location r0 = r7.getLastKnownLocationForProvider(r0)
            goto L13
        L12:
            r0 = r1
        L13:
            android.content.Context r2 = r7.mContext
            java.lang.String r3 = "android.permission.ACCESS_FINE_LOCATION"
            int r2 = androidx.core.content.PermissionChecker.checkSelfPermission(r2, r3)
            if (r2 != 0) goto L23
            java.lang.String r1 = "gps"
            android.location.Location r1 = r7.getLastKnownLocationForProvider(r1)
        L23:
            if (r1 == 0) goto L35
            if (r0 == 0) goto L35
            long r2 = r1.getTime()
            long r4 = r0.getTime()
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 <= 0) goto L34
            return r1
        L34:
            return r0
        L35:
            if (r1 == 0) goto L38
            return r1
        L38:
            return r0
    }

    @androidx.annotation.RequiresPermission(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
    private android.location.Location getLastKnownLocationForProvider(java.lang.String r2) {
            r1 = this;
            android.location.LocationManager r0 = r1.mLocationManager     // Catch: java.lang.Exception -> Lf
            boolean r0 = r0.isProviderEnabled(r2)     // Catch: java.lang.Exception -> Lf
            if (r0 == 0) goto Lf
            android.location.LocationManager r0 = r1.mLocationManager     // Catch: java.lang.Exception -> Lf
            android.location.Location r2 = r0.getLastKnownLocation(r2)     // Catch: java.lang.Exception -> Lf
            return r2
        Lf:
            r2 = 0
            return r2
    }

    private boolean isStateValid() {
            r5 = this;
            androidx.appcompat.app.TwilightManager$TwilightState r0 = r5.mTwilightState
            long r0 = r0.nextUpdate
            long r2 = java.lang.System.currentTimeMillis()
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto Le
            r0 = 1
            return r0
        Le:
            r0 = 0
            return r0
    }

    @androidx.annotation.VisibleForTesting
    static void setInstance(androidx.appcompat.app.TwilightManager r0) {
            androidx.appcompat.app.TwilightManager.sInstance = r0
            return
    }

    private void updateState(@androidx.annotation.NonNull android.location.Location r19) {
            r18 = this;
            r0 = r18
            androidx.appcompat.app.TwilightManager$TwilightState r1 = r0.mTwilightState
            long r3 = java.lang.System.currentTimeMillis()
            androidx.appcompat.app.TwilightCalculator r5 = androidx.appcompat.app.TwilightCalculator.getInstance()
            r12 = 86400000(0x5265c00, double:4.2687272E-316)
            long r6 = r3 - r12
            double r8 = r19.getLatitude()
            double r10 = r19.getLongitude()
            r5.calculateTwilight(r6, r8, r10)
            double r6 = r19.getLatitude()
            r2 = r5
            r5 = r6
            double r7 = r19.getLongitude()
            r2.calculateTwilight(r3, r5, r7)
            r5 = r2
            int r2 = r5.state
            r6 = 1
            if (r2 != r6) goto L31
            r2 = 1
            goto L33
        L31:
            r6 = 0
            r2 = 0
        L33:
            long r14 = r5.sunrise
            long r6 = r5.sunset
            long r8 = r3 + r12
            r10 = r6
            r6 = r8
            double r8 = r19.getLatitude()
            double r12 = r19.getLongitude()
            r16 = r12
            r12 = r10
            r10 = r16
            r5.calculateTwilight(r6, r8, r10)
            long r5 = r5.sunrise
            r7 = -1
            int r9 = (r14 > r7 ? 1 : (r14 == r7 ? 0 : -1))
            if (r9 == 0) goto L68
            int r9 = (r12 > r7 ? 1 : (r12 == r7 ? 0 : -1))
            if (r9 != 0) goto L58
            goto L68
        L58:
            int r7 = (r3 > r12 ? 1 : (r3 == r12 ? 0 : -1))
            if (r7 <= 0) goto L5e
            r14 = r5
            goto L63
        L5e:
            int r5 = (r3 > r14 ? 1 : (r3 == r14 ? 0 : -1))
            if (r5 <= 0) goto L63
            r14 = r12
        L63:
            r3 = 60000(0xea60, double:2.9644E-319)
            long r14 = r14 + r3
            goto L6d
        L68:
            r5 = 43200000(0x2932e00, double:2.1343636E-316)
            long r14 = r3 + r5
        L6d:
            r1.isNight = r2
            r1.nextUpdate = r14
            return
    }

    boolean isNight() {
            r2 = this;
            androidx.appcompat.app.TwilightManager$TwilightState r0 = r2.mTwilightState
            boolean r1 = r2.isStateValid()
            if (r1 == 0) goto Lb
            boolean r0 = r0.isNight
            return r0
        Lb:
            android.location.Location r1 = r2.getLastKnownLocation()
            if (r1 == 0) goto L17
            r2.updateState(r1)
            boolean r0 = r0.isNight
            return r0
        L17:
            java.util.Calendar r0 = java.util.Calendar.getInstance()
            r1 = 11
            int r0 = r0.get(r1)
            r1 = 6
            if (r0 < r1) goto L2b
            r1 = 22
            if (r0 < r1) goto L29
            goto L2b
        L29:
            r0 = 0
            return r0
        L2b:
            r0 = 1
            return r0
    }
}
