package geodist;

public class GeoDistRunner {
    public static void main(String[] args) {
        System.out.println(distance(39.8883, -104.7, 39.9, -104.7, "M") + " Miles\n");
        System.out.println(distance(39.8883, -104.68333, 39.9, -104.7, "K") + " Kilometers\n");
        System.out.println(distance(39.9, -104.7, 40.06668, -104.7, "N") + " Nautical Miles\n");
        System.out.println(meters(39.9, -104.7, 40.07189, -104.7));
        System.out.println(distance1(39.9, -104.7, 40.07189, -104.7, "N"));
    }

    private static double distance(double lat1, double lon1, double lat2, double lon2, String unit) {
        if ((lat1 == lat2) && (lon1 == lon2)) {
            return 0;
        }
        else {
            double theta = lon1 - lon2;
            double dist = Math.sin(Math.toRadians(lat1)) * Math.sin(Math.toRadians(lat2)) + Math.cos(Math.toRadians(lat1)) * Math.cos(Math.toRadians(lat2)) * Math.cos(Math.toRadians(theta));
            dist = Math.acos(dist);
            dist = Math.toDegrees(dist);
            dist = dist * 60 * 1.1515;
            if (unit.equals("K")) {
                dist = dist * 1.609344;
            } else if (unit.equals("N")) {
                dist = dist * 0.8684;
            }
            return (dist);
        }
    }

    private static final double r2d = 180.0D / 3.141592653589793D;
    private static final double d2r = 3.141592653589793D / 180.0D;
    private static final double d2km = 111189.57696D * r2d;
    public static double meters(double lt1, double ln1, double lt2, double ln2) {
        final double x = lt1 * d2r;
        final double y = lt2 * d2r;
        return Math.acos( Math.sin(x) * Math.sin(y) + Math.cos(x) * Math.cos(y) * Math.cos(d2r * (ln1 - ln2))) * d2km;
    }

    public static double distance1(double lat1, double lon1, double lat2, double lon2, String sr) {
        double theta = lon1 - lon2;
        double dist = Math.sin(deg2rad(lat1)) * Math.sin(deg2rad(lat2)) + Math.cos(deg2rad(lat1)) * Math.cos(deg2rad(lat2)) * Math.cos(deg2rad(theta));
        dist = Math.acos(dist);
        dist = rad2deg(dist);
        dist = dist * 60 * 1.1515;
        if (sr.equals("K")) {
            dist = dist * 1.609344;
        } else if (sr.equals("N")) {
            dist = dist * 0.8684;
        }
        return (dist);
    }
    public static double deg2rad(double deg) {
        return (deg * Math.PI / 180.0);
    }
    public static double rad2deg(double rad) {
        return (rad * 180.0 / Math.PI);
    }
}
