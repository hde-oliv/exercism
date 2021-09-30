# Please implement your solution to acronym in this file

class Acronym
  def Acronym.abbreviate(title : String)
    first_letter_array = title.scan(/(?<=\ |_|-|^)[A-Za-z]{1}/)
    first_letter_array.map do |letter|
      letter[0].upcase
    end.join
  end
end
