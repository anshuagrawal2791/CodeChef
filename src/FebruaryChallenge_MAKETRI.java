
import java.util.*;
import java.util.regex.Matcher;

/**
 * Created by anshu on 03/02/17.
 */
class FebruaryChallenge_MAKETRI {

        public static double count=0;
        public static ArrayList<interval> range;
        public static double[] range2;
        public static Stack<interval> ranges;

        static class interval{
            private double start,end;

            public interval(double start, double end) {
                this.start = start;
                this.end = end;
            }

            public double getStart() {
                return start;
            }

            public double getEnd() {
                return end;
            }

            public void setStart(double start) {
                this.start = start;
            }

            public void setEnd(double end) {
                this.end = end;
            }

            @Override
            public String toString() {
                return "interval{" +
                        "start=" + start +
                        ", end=" + end +
                        '}';
            }
        }
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
//        System.out.print(Double.MAX_VALUE);

            int n = scanner.nextInt();
            double l = scanner.nextDouble();
            double r = scanner.nextDouble();

            range = new ArrayList<>();
//        range2 = new double[r-l+1];
            ranges = new Stack<>();



            double [] lenghts = new double[n];
            for(int i=0;i<n;i++)
                lenghts[i]=scanner.nextDouble();

            for(int i=0;i<n-1;i++){
                for(int j=i+1;j<n;j++){
                    double a = Math.abs(lenghts[j]-lenghts[i])+1;
                    double b = lenghts[j]+lenghts[i]-1;
                    if(a<=r){
                        if(a<l)
                            a=l;
                        if(b>r)
                            b=r;
                        range.add(new interval(a,b));
                    }

//
                }
            }
            Collections.sort(range, new Comparator<interval>() {
                @Override
                public int compare(interval o1, interval o2) {
                    return Double.compare(o1.getStart(),o2.getStart());
                }
            });
//        System.out.println(range.toString());
            ranges.push(range.get(0));
            for (int i = 1 ; i < range.size(); i++)
            {
                // get interval from stack top
                interval top = ranges.peek();

                // if current interval is not overlapping with stack top,
                // push it to the stack
                if (top.end < range.get(i).start-1)
                    ranges.push(range.get(i));

                    // Otherwise update the ending time of top if ending of current
                    // interval is more
                else if (top.end < range.get(i).end)
                {
                    top.end = range.get(i).end;
                    ranges.pop();
                    ranges.push(top);
                }
//            System.out.println("--"+ranges.toString());
            }

//        System.out.printf("%.0f",count);
//        System.out.print(ranges.peek().toString());

//        System.out.println(ranges.toString());

            while(!ranges.isEmpty())
            {
                interval x = ranges.pop();
                count+=x.getEnd()-x.getStart()+1;
            }

            System.out.printf("%.0f \n",count);


        }

        private static void remove(double low, double high) {
//        for(int i=0;i<(high-low+1);i++)
//        {
//            if(range.contains(low+i)){
//                count++;
//                range.remove(low+i);
//            }
//        }

        }

}
