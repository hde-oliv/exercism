# Please implement your solution to acronym in this file

class Acronym
  def Acronym.abbreviate(title : String)
    first_letter_array = title.scan(/\b[a-zA-z]{1}/)
    acronym = ""
    first_letter_array.each do |letter|
      acronym = acronym + letter[0]
    end
    return acronym.upcase
  end
end
