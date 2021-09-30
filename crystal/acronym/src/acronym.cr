# Please implement your solution to acronym in this file

class Acronym
  def Acronym.abbreviate(title : String)
    array = title.scan(/(?<=\ |_|-|^)[A-Za-z]{1}/).map(&.[0][0]).join.upcase
  end
end
