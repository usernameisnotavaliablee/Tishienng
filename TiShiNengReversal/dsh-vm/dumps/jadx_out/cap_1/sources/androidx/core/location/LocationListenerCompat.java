package androidx.core.location;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public interface LocationListenerCompat extends android.location.LocationListener {
    @Override // android.location.LocationListener
    void onFlushComplete(int r1);

    @Override // android.location.LocationListener
    void onLocationChanged(@androidx.annotation.NonNull java.util.List<android.location.Location> r1);

    @Override // android.location.LocationListener
    void onProviderDisabled(@androidx.annotation.NonNull java.lang.String r1);

    @Override // android.location.LocationListener
    void onProviderEnabled(@androidx.annotation.NonNull java.lang.String r1);

    @Override // android.location.LocationListener
    void onStatusChanged(@androidx.annotation.NonNull java.lang.String r1, int r2, @androidx.annotation.Nullable android.os.Bundle r3);
}
