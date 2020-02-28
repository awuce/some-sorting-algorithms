=begin
  Bubble Sorting Algorithm on Ruby
=end

class Bubble
  def bubble(a)
    for i in 0..a.length-1
      for j in 0..(a.length-i-2)
        a[j], a[j+1] = a[j+1], a[j] if (a[j] > a[j+1])
      end
    end
  end
end

class Start
  def initialize
    print "Bubble Sorting Algorithm\n\n"
    a = []
    File.open("array.txt").each_with_index { |line, i|
      a[i] = line.to_i
    }
    print_array("Before:", a)
    Bubble.new.bubble(a)
    print_array("After: ", a)
  end

  def print_array(message, a)
      print message
      a.each { |x| print " #{x}"}
      print "\n"
  end
end

Start.new
